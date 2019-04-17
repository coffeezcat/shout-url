package com.coffeezcat.shouturl.task.pojo;

import com.coffeezcat.shouturl.entity.Link;

/**
 * @author coffezcat
 * @title: AccessInfo
 * @description: TODO
 * @date 2019/4/17 11:10
 */
public class AccessInfo {
    private Link link;
    private String ip;
    private String device;

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
