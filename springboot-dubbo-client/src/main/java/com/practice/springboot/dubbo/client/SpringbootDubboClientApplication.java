package com.practice.springboot.dubbo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ImportResource("classpath:consumer.xml") //加载xml配置文件
@RestController
public class SpringbootDubboClientApplication {
    @Autowired
    OrderService orderService;

	@RequestMapping("/canbuy")
	public String canBuy(@RequestParam("id") String id){
		return orderService.checkBuyStatus(id);
	}

    public static void main(String[] args) throws Exception{
		SpringApplication.run(SpringbootDubboClientApplication.class, args);
	}
}
