package com.itheima.springbootwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWarApplication {

	//使用外部的tomcat，需要自己在设置里面配置	链接：https://blog.csdn.net/weixin_44340836/article/details/111218271
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWarApplication.class, args);
	}

}
