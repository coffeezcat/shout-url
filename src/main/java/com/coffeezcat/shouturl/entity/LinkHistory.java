package com.coffeezcat.shouturl.entity;

import java.util.Date;

public class LinkHistory {
    private String id;

    private String linkId;

    private String linkCode;

    private String linkUrl;

    private String cReferer;

    private String cIp;

    private String cDevice;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId == null ? null : linkId.trim();
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode == null ? null : linkCode.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getcReferer() {
        return cReferer;
    }

    public void setcReferer(String cReferer) {
        this.cReferer = cReferer == null ? null : cReferer.trim();
    }

    public String getcIp() {
        return cIp;
    }

    public void setcIp(String cIp) {
        this.cIp = cIp == null ? null : cIp.trim();
    }

    public String getcDevice() {
        return cDevice;
    }

    public void setcDevice(String cDevice) {
        this.cDevice = cDevice == null ? null : cDevice.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}