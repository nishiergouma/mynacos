package com.consumer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version : 1.0
 * @Title:
 * @Description:
 * @author: HF
 * @Date: 2021/6/26 15:26
 */
@RestController
@RequestMapping("/test")
public class TestController {

    //注入 @FeignClient 注解配置 所配置的 EchoClient 客户端Feign实例
    @Resource
    EchoClient echoClient;


    //回显服务
    @RequestMapping(value = "/{string}", method = RequestMethod.GET)
    public String echoRemoteEcho(@PathVariable String string) {
        return "provider echo is:" + echoClient.echo(string);
    }
}