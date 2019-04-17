package com.coffeezcat.shouturl.controller;

import com.coffeezcat.shouturl.entity.Link;
import com.coffeezcat.shouturl.mapper.LinkHistoryMapper;
import com.coffeezcat.shouturl.service.UrlCodeService;
import com.coffeezcat.shouturl.task.LinkHistoryTask;
import com.coffeezcat.shouturl.task.pojo.AccessInfo;
import com.coffeezcat.shouturl.util.HttpUtil;
import com.coffeezcat.shouturl.util.UrlCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;

/**
 * @author coffezcat
 * @title: IndexController
 * @projectName shout-url
 * @description: 首页
 * @date 2019/4/16 18:08
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    UrlCodeService urlCodeService;

    @Autowired
    LinkHistoryMapper linkHistoryMapper;

    @Autowired
    ThreadPoolExecutor threadPoolExecutor;

    @RequestMapping("/{code}")
    @ResponseBody
    public String jump(@PathVariable("code") String code, HttpServletResponse response, HttpServletRequest request)throws Exception{
        Link link = urlCodeService.getUrl(code);
        if(Objects.isNull(link)){
            return "shout url not exist!";
        }

        //记录日志
        AccessInfo accessInfo = new AccessInfo();
        accessInfo.setLink(link);
        accessInfo.setIp(HttpUtil.getIpAddr(request));
        accessInfo.setDevice(HttpUtil.getUserAgent(request));
        LinkHistoryTask task = new LinkHistoryTask(linkHistoryMapper,accessInfo);
        threadPoolExecutor.execute(task);

        //发起跳转
        response.setStatus(302);
        String linkUrl = URLDecoder.decode(link.getUrl(),"utf-8");
        response.sendRedirect(linkUrl);
        return "";
    }


    @RequestMapping("/generate")
    @ResponseBody
    public String generateCode(String url,Integer bit)throws Exception{
        log.info("url:{}",url);
        if(StringUtils.isEmpty(url)){
            return "url can't be null or empty";
        }
        url = url.trim();
        if(!UrlCodeUtil.isUrl(URLDecoder.decode(url,"utf-8"))){
            return "url format is error";
        }

        if(Objects.isNull(bit)||bit <=0){
            //默认6位
            bit = 6;
        }
        String code = null;
        try {
           code=urlCodeService.encodeUrl(url,bit);
        }catch (Exception e){
            return "generate shout url error:"+e.getMessage();
        }


        return code;
    }
}
