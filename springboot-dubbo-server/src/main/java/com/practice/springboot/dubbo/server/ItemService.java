package com.practice.springboot.dubbo.server;

public interface ItemService {
    //检查商品是否可售
    boolean checkItemStatus(String id);
}
