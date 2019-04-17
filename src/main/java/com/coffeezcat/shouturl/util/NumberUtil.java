package com.coffeezcat.shouturl.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NumberUtil {

    public static char[] chars ={
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            '0','1','2','3','4','5','6','7','8','9',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
    };

    private static final int LENGTH = 62;

    /**
     * @param number 要转换的十进制数
     * @param system 转换的进制位
     */
    public static List<Integer> dexToNex(long number, int system){
        Stack<Integer> stack = new Stack<Integer>();
        while (number > 0) {
            stack.add((int)(number % system));
            number /= system;
        }
        List<Integer> bits = new ArrayList<>(8);
        while (!stack.empty()){
            bits.add(stack.pop());
        }
        return bits;
    }

    /***
     *十进制转给定格式的字符串
     * @param number 要转换的十进制数
     */
    public static String dexToNexCode(long number){
        StringBuilder sb = new StringBuilder();
        List<Integer> bits = dexToNex(number,LENGTH);
        for (int i: bits) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
