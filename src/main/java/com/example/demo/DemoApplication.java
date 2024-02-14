package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.manager.PurcharsedManager;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	PurcharsedManager manager;

	@Bean
	CommandLineRunner init(){
		return args ->{
			Producto producto  = new Producto("Television", 15);
			manager.purcharsedManager("1", "Television", producto, 10);
			manager.purcharsedManager("1", "Television", producto, 5);

		};
	}



}
