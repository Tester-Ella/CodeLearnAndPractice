package com.practice.springboot.dubbo.server;

import com.alibaba.dubbo.config.annotation.Service;

@Service  //该Service注解是dubbo的注解，不是spring的。若使用xml配置方式暴露接口，则不需要该注解。
public class ItemServiceImpl implements ItemService {

    @Override
    public boolean checkItemStatus(String id) {
        if (id.contains("111")) {
            return true;
        } else {
            return false;
        }
    }
}
