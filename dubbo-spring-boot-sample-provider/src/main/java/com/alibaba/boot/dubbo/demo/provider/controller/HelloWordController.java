package com.alibaba.boot.dubbo.demo.provider.controller;

import com.alibaba.boot.dubbo.demo.consumer.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明: o_o<br>
 * 注意事项: <br>
 * 系统版本: v1.0<br>
 * 开发人员: wuhulala<br>
 * 开发时间: 2018/7/5<br>
 */
@RestController
public class HelloWordController {
    @Reference
    private HelloService helloService;

    ///////////////////////////// 方法区 ////////////////////////////////////

    @RequestMapping("/hello")
    public String hello(){
        return helloService.sayHello();
    }
}
