package com.coffeezcat.shouturl.util;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author coffezcat
 * @title: SidProducer
 * @description: TODO
 * @date 2019/4/17 9:19
 */
public class SidProducer {
    private String ip;
    private AtomicLong sep;
    private static final int atomicMax = 999999;
    private static final int SerialBit = 6;

    private SidProducer() {
        this.init();
    }

    public static final SidProducer getInstance() {
        return SidProducer.SidProducerHolder.INSTANCE;
    }

    public String next() {
        SimpleDateFormat sFormat = new SimpleDateFormat("yyMMddHHmmssSSS");
        StringBuffer sbs = new StringBuffer(sFormat.format(new Date()));
        sbs.append(this.ip);
        AtomicLong var3 = this.sep;
        synchronized(this.sep) {
            long inc = this.sep.addAndGet(1L);
            if (inc >= 999999L) {
                this.sep = new AtomicLong();
            }

            sbs.append(this.alignRight(inc, 6));
        }

        return sbs.toString();
    }

    private void init() {
        int ipadd;
        try {
            ipadd = this.toInt(InetAddress.getLocalHost().getAddress());
        } catch (Exception var4) {
            Calendar cal = Calendar.getInstance();
            ipadd = cal.get(14);
            System.out.println("ip error");
        }

        this.ip = this.alignRight((long)ipadd, 3);
        long atomicInitValue = (long)(new Random(System.currentTimeMillis())).nextInt(999999);
        this.sep = new AtomicLong(atomicInitValue);
    }

    private int toInt(byte[] bytes) {
        int result = bytes[3] & 255;
        return result;
    }

    private String alignRight(long src, int len) {
        StringBuffer sbs = new StringBuffer();
        sbs.append(src);

        while(sbs.length() < len) {
            sbs.insert(0, "0");
        }

        return sbs.toString();
    }

    public static void main(String[] agrs) {
        SidProducer sidProductService = getInstance();

        for(int i = 0; i < 100; ++i) {
            String sid = sidProductService.next();
            System.out.println(sid);
        }

    }

    private static class SidProducerHolder {
        private static final SidProducer INSTANCE = new SidProducer();

        private SidProducerHolder() {
        }
    }
}
