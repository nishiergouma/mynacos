package com.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version : 1.0
 * @Title:
 * @Description:
 * @author: HF
 * @Date: 2021/6/26 16:21
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${test.value}")
    private String value;

    @GetMapping("/get")
    public String getValue(){
        return value;
    }
}