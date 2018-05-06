package com.st.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.st.controller")
@EnableAutoConfiguration
public class App {

	public static void main(String[] args) {
		// 主函数运行springboot项目
		SpringApplication.run(App.class, args);
	}
}
