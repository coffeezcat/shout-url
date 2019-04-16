package com.coffeezcat.shouturl.util;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NumberUtilTest {

    @Test
    public void dexToNex() {
       List<Integer> bits =  NumberUtil.dexToNex(100,15);
        System.out.println(111);
    }

    @Test
    public void dexToNexCode() {
       String code =  NumberUtil.dexToNexCode(1);
        System.out.println(code);

        System.out.println(NumberUtil.chars.length);
    }
}