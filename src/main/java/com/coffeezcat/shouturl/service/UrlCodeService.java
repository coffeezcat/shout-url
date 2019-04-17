package com.coffeezcat.shouturl.service;


import com.coffeezcat.shouturl.entity.Link;

public interface UrlCodeService {

    /**
     * 自动生成短码
     * @param url 要生成的url
     * @param bit 生成短码的位数
     * */
    String encodeUrl(String url,int bit)throws Exception;

    /**
     * 根据code获取url
     * */
    Link getUrl(String code);

    /**
     * 自定义code生成url
     * @param url url
     * @param code 自定义的code
     * */
    Link customizeUrlCode(String url,String code);

}
