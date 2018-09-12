package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类，执行这个类的main方法
@SpringBootApplication
public class RunApp {
	//执行入口
public static void main(String[] args) {
	//需要spring环境启动
     SpringApplication.run(RunApp.class, args);
}
}
