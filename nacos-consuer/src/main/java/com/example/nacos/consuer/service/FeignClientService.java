package com.example.nacos.consuer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "nacos-provider",fallback = FeignClientServiceFallback.class,configuration = FeignConfifuration.class)
@RequestMapping("/provider")
public interface FeignClientService {

    @GetMapping("/say/{msg}")
    String say(@PathVariable String msg);
}

class FeignClientServiceFallback implements FeignClientService{

    @Override
    public String say(@PathVariable String msg) {
        return "服务不可用";
    }
}

class FeignConfifuration{
    @Bean
    public FeignClientServiceFallback feignClientServiceFallback(){
        return new FeignClientServiceFallback();
    }
}