package com.coffeezcat.shouturl.service.impl;

import com.coffeezcat.shouturl.component.InitializingDexVal;
import com.coffeezcat.shouturl.entity.Link;
import com.coffeezcat.shouturl.entity.LinkExample;
import com.coffeezcat.shouturl.enums.GenerateModeEnum;
import com.coffeezcat.shouturl.mapper.LinkMapper;
import com.coffeezcat.shouturl.service.UrlCodeService;
import com.coffeezcat.shouturl.util.NumberUtil;
import com.coffeezcat.shouturl.util.SidProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

@Service
public class UrlCodeServiceImpl implements UrlCodeService{

    @Autowired
    InitializingDexVal initializingDexVal;

    @Autowired
    LinkMapper linkMapper;

    @Override
    public String encodeUrl(String url, int bit)throws Exception {


        //查询是否存在
        LinkExample example = new LinkExample();
        example.createCriteria().andUrlEqualTo(url);

        List<Link> links = linkMapper.selectByExample(example);
        if(links != null && links.size()>0){
            throw new RuntimeException("url had generated");
        }

        //获取下一个序列号
        long dexVal = initializingDexVal.getDexVal(bit);
        //获取编码
        String code = NumberUtil.dexToNexCode(dexVal);
        //入库
        Link link = new Link();
        link.setLinkId(SidProducer.getInstance().next());
        link.setBits((byte)bit);
        link.setCode(code);
        link.setDecVal(dexVal);
        link.setType(GenerateModeEnum.System.getCode());
        link.setUrl(url);
        link.setCreateTime(new Date());
        link.setUpdateTime(new Date());
        if(linkMapper.insertSelective(link) !=1){
            //入库失败减1
            initializingDexVal.decDexVal(bit);
            throw new RuntimeException("shout url generated failed");
        }
        return code;
    }

    @Override
    public Link getUrl(String code) {
        LinkExample example = new LinkExample();
        example.createCriteria().andCodeEqualTo(code);
        List<Link> links =  linkMapper.selectByExample(example);
        if(links != null && links.size()>0){
         return links.get(0);
        }
        return null;
    }

    @Override
    public Link customizeUrlCode(String url, String code) {
        LinkExample example = new LinkExample();
        example.or().andUrlEqualTo(url);
        example.or().andUrlEqualTo(url);
        List<Link> links = linkMapper.selectByExample(example);
        if(links != null && links.size()>0){
            throw new RuntimeException("url or code had generated");
        }
        Link link = new Link();
        link.setLinkId(SidProducer.getInstance().next());
        link.setBits((byte)0);
        link.setCode(code);
        link.setDecVal(0l);
        link.setType(GenerateModeEnum.Customize.getCode());
        link.setUrl(url);
        link.setCreateTime(new Date());
        link.setUpdateTime(new Date());
        if(linkMapper.insertSelective(link) !=1){
            throw new RuntimeException("shout url generated failed");
        }
        return link;
    }
}
