package com.example.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ServiceController {
    //  提供服务
    @GetMapping("/say/{msg}")
    public String say(@PathVariable String msg){
        return "您说刚刚说："+msg;
    }

}
