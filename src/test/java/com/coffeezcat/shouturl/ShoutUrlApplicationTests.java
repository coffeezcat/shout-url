package com.coffeezcat.shouturl;

import com.coffeezcat.shouturl.entity.Link;
import com.coffeezcat.shouturl.entity.LinkExample;
import com.coffeezcat.shouturl.mapper.LinkMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoutUrlApplicationTests {

	@Autowired
	LinkMapper linkMapper;
	@Test
	public void contextLoads() {
		List<Link> links=  linkMapper.selectByExample(new LinkExample());
		System.out.println(11);
	}

	@Autowired
	ThreadPoolExecutor threadPoolExecutor;
	@Test
	public void  testPool(){
		threadPoolExecutor.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println(1111);
				try {
					Thread.sleep(3000);
				}catch (Exception e){

				}
				System.out.println(2222);
			}
		});

		try {
			Thread.sleep(4000);
		}catch (Exception e){

		}
	}

}
