package cn.xuhongfei.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/products")
    public Object products() {
        return "我是来自 " + port + " 的产品";
    }
}
