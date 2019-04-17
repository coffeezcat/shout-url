package com.coffeezcat.shouturl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author coffezcat
 * @title: Result
 * @description: TODO
 * @date 2019/4/17 14:42
 */
@Getter
@Setter
public class Result {
    boolean success;
    String msg;
    String urlCode;
}
