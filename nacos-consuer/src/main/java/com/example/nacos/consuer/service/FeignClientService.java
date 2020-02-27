package com.example.nacos.consuer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "nacos-provider")
@RequestMapping("/provider")
public interface FeignClientService {

    @GetMapping("/say/{msg}")
    String say(@PathVariable String msg);
}
