package com.coffeezcat.shouturl.service;


import com.coffeezcat.shouturl.entity.Link;

public interface UrlCodeService {

    /**
     * url生成短码
     * @param url 要生成的url
     * @param bit 生成短码的位数
     * */
    String encodeUrl(String url,int bit)throws Exception;

    /**
     * 根据code获取url
     * */
    Link getUrl(String code);
}
