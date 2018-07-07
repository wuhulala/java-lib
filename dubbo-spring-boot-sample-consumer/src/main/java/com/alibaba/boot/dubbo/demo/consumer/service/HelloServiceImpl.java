package com.alibaba.boot.dubbo.demo.consumer.service;

import com.alibaba.boot.dubbo.demo.consumer.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 功能说明: ${END}<br>
 * 注意事项: <br>
 * 系统版本: v1.0<br>
 * 开发人员: wuhulala<br>
 * 开发时间: 2018/7/5<br>
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class HelloServiceImpl implements HelloService {


    ///////////////////////////// 方法区 ////////////////////////////////////

    @Override
    public String sayHello() {
        return "Hello World";
    }
}
