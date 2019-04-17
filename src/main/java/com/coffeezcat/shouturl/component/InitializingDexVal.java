package com.coffeezcat.shouturl.component;

import com.coffeezcat.shouturl.entity.Link;
import com.coffeezcat.shouturl.entity.LinkExample;
import com.coffeezcat.shouturl.mapper.LinkMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicLongArray;
@Slf4j
@Component
public class InitializingDexVal implements InitializingBean {

    //每位的最大数字

    private static final long[]  LIMIT_NUM = {61,3843,238327,14776335,916132831,56800235583l};

    private static volatile long[] bitsNum = {1,62,3844,238328,14776336,916132832};
    private static volatile AtomicLongArray bitAtomicArray = new AtomicLongArray(bitsNum);
    @Autowired
    LinkMapper linkMapper;

    @Override
    public void afterPropertiesSet() throws Exception {

        log.info("开始初始化游标数据");
        LinkExample example = new LinkExample();
        //查询1位
        example.createCriteria().andDecValBetween(bitAtomicArray .get(0),LIMIT_NUM[0]);
        example.setOrderByClause("dec_val desc limit 1");
        List<Link> links=  linkMapper.selectByExample(example);
        if(links!=null&&links.size()>0){
            bitAtomicArray .set(0,links.get(0).getDecVal());
        }
        example.clear();

        //查询2位
        example.createCriteria().andDecValBetween(bitAtomicArray .get(1),LIMIT_NUM[1]);
        example.setOrderByClause("dec_val desc limit 1");
        links=  linkMapper.selectByExample(example);
        if(links!=null&&links.size()>0){
            bitAtomicArray .set(1,links.get(0).getDecVal());
        }
        example.clear();

        //查询3位
        example.createCriteria().andDecValBetween(bitAtomicArray .get(2),LIMIT_NUM[2]);
        example.setOrderByClause("dec_val desc limit 1");
         links=  linkMapper.selectByExample(example);
        if(links!=null&&links.size()>0){
            bitAtomicArray .set(2,links.get(0).getDecVal());
        }

        example.clear();
        //查询4位
        example.createCriteria().andDecValBetween(bitAtomicArray .get(3),LIMIT_NUM[3]);
        example.setOrderByClause("dec_val desc limit 1");
        links=  linkMapper.selectByExample(example);
        if(links!=null&&links.size()>0){
            bitAtomicArray .set(3,links.get(0).getDecVal());
        }
        example.clear();

        //查询5位
        example.createCriteria().andDecValBetween(bitAtomicArray .get(4),LIMIT_NUM[4]);
        example.setOrderByClause("dec_val desc limit 1");
        links=  linkMapper.selectByExample(example);
        if(links!=null&&links.size()>0){
            bitAtomicArray .set(4,links.get(0).getDecVal());
        }
        example.clear();

        //查询6位
        example.createCriteria().andDecValBetween(bitAtomicArray .get(5),LIMIT_NUM[5]);
        example.setOrderByClause("dec_val desc limit 1");
        links=  linkMapper.selectByExample(example);
        if(links!=null&&links.size()>0){
            bitAtomicArray .set(5,links.get(0).getDecVal());
        }
        log.info("初始化游标数据结束");
    }

    /**
     *获取最新的值
     */
    public long getDexVal(int bit){
       if(bitAtomicArray.get(bit-1)==LIMIT_NUM[bit-1]){
           throw new RuntimeException("很抱歉,该位置位数已用完");
       }
       bitAtomicArray.getAndIncrement(bit-1);
        return bitAtomicArray.get(bit-1);
    }

    /**
     * longArray减去1
     * */
    public long decDexVal(int bit){
        bitAtomicArray.decrementAndGet(bit-1);
        return bitAtomicArray.get(bit-1);
    }

}
