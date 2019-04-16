package com.coffeezcat.shouturl.entity;

import java.util.Date;

public class Link {
    private Long linkId;

    private String url;

    private String code;

    private String type;

    private Byte bits;

    private Long decVal;

    private Date createTime;

    private Date updateTime;

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getBits() {
        return bits;
    }

    public void setBits(Byte bits) {
        this.bits = bits;
    }

    public Long getDecVal() {
        return decVal;
    }

    public void setDecVal(Long decVal) {
        this.decVal = decVal;
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