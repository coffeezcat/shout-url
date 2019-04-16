package com.coffeezcat.shouturl.entity;

import java.util.Date;

public class LinkHistory {
    private Long id;

    private Long linkId;

    private String linkCode;

    private String linkUrl;

    private Integer cIp;

    private String cDevice;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
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

    public Integer getcIp() {
        return cIp;
    }

    public void setcIp(Integer cIp) {
        this.cIp = cIp;
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