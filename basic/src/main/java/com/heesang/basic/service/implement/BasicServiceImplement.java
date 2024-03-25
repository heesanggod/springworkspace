package com.heesang.basic.service.implement;

import com.heesang.basic.service.BasicService;

public class BasicServiceImplement implements BasicService {

    @Override
    public String getHello() {
        return "Hello Springboot!!"; 
    }

    @Override
    public String getApple() {
        return "Get Mapping 으로 만든 메서드";
    }
    
}
