package com.example.demo;

// import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
	programmer obj = context.getBean(programmer.class);
	obj.code();
	}

}
