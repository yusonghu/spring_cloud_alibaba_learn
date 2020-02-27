package com.example.nacos.consuer.controller;

import com.example.nacos.consuer.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FController {

    @Autowired
    private FeignClientService feignClientService;

    @GetMapping("/f/{msg}")
    public String msg(@PathVariable String msg){
        return feignClientService.say(msg);
    }
}
