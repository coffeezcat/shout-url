package com.coffeezcat.shouturl.enums;

/**
 * @author coffezcat
 * @title: GenerateModeEnum
 * @description: TODO
 * @date 2019/4/17 14:20
 */
public enum GenerateModeEnum {
    System("s","系统生成"),
    Customize("c","自定义");
    String code;
    String desc;

    private GenerateModeEnum(String code,String desc){
        this.code=code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
