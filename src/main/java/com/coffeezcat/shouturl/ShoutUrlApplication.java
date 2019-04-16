package com.coffeezcat.shouturl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.coffeezcat.shouturl.mapper")
@ComponentScan({"com.coffeezcat.shouturl"})
public class ShoutUrlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoutUrlApplication.class, args);
	}

}
