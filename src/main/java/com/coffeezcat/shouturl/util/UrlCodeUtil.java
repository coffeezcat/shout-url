package com.coffeezcat.shouturl.util;

import java.util.regex.Pattern;

/**
 * @author coffezcat
 * @title: UrlCodeUtil
 * @projectName shout-url
 * @description: 短地址链接生成工具
 * @date 2019/4/16 18:08
 */
public class UrlCodeUtil {

    /**
     *@param url 要校验的url
     * */
    public static boolean isUrl(String url){
        Pattern pattern = Pattern
                .compile("^([hH][tT]{2}[pP]://|[hH][tT]{2}[pP][sS]://)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+$");

       return pattern.matcher(url).matches();
    }

}
