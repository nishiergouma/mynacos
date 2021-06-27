package com.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @version : 1.0
 * @Title:
 * @Description:
 * @author: HF
 * @Date: 2021/6/26 15:27
 */
@FeignClient("service-provider")
public interface EchoClient {

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    String echo(@PathVariable String string);
}
