package com.practice.springboot.dubbo.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.practice.springboot.dubbo.server.ItemService;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    //注入服务提供方暴露的接口，通过@Reference注解，dubbo会在扫描的时候自动代理接口，然后通过rpc调用远程服务
    @Reference
    ItemService itemService;

    public String checkBuyStatus(String id) {
        boolean flag = itemService.checkItemStatus(id);
        if (flag) {
            return "can buy!";
        } else {
            return "can not buy!";
        }
    }
}
