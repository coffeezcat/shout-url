package com.coffeezcat.shouturl.task;

import com.coffeezcat.shouturl.entity.Link;
import com.coffeezcat.shouturl.entity.LinkHistory;
import com.coffeezcat.shouturl.mapper.LinkHistoryMapper;
import com.coffeezcat.shouturl.task.pojo.AccessInfo;
import com.coffeezcat.shouturl.util.SidProducer;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author coffezcat
 * @title: LinkHistoryTask
 * @description: 落库任务
 * @date 2019/4/17 11:08
 */
@Slf4j
public class LinkHistoryTask implements Runnable{

    private LinkHistoryMapper linkHistoryMapper;
    private AccessInfo accessInfo;


    public LinkHistoryTask(LinkHistoryMapper linkHistoryMapper,AccessInfo accessInfo){
        this.linkHistoryMapper = linkHistoryMapper;
        this.accessInfo = accessInfo;
    }

    @Override
    public void run() {
        log.info("访问历史入库");
        try {
            LinkHistory linkHistory = new LinkHistory();
            linkHistory.setId(SidProducer.getInstance().next());
            Link link = accessInfo.getLink();
            linkHistory.setLinkId(link.getLinkId());
            linkHistory.setLinkUrl(link.getUrl());
            linkHistory.setLinkCode(link.getCode());
            linkHistory.setcIp(accessInfo.getIp());
            linkHistory.setcDevice(accessInfo.getDevice());
            linkHistory.setcReferer(accessInfo.getReferer());
            linkHistory.setCreateTime(new Date());
            linkHistory.setUpdateTime(new Date());
            linkHistoryMapper.insertSelective(linkHistory);
        }catch (Exception e){
            log.error("访问记录入库异常:{}",e);
        }
       log.info("访问入库成功");
    }
}
