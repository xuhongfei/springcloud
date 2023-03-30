package cn.xuhongfei.controller;

import cn.xuhongfei.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RefreshScope
public class ProductController {

    @Autowired
    ProductService productService;

    @Value("${config.version}")
    String configVersion;

    @Value("${config.info}")
    String configInfo;

    @RequestMapping("/products")
    public Object products(Model m) {
        String s = productService.products();
        m.addAttribute("s", s);
        m.addAttribute("info", configInfo);
        m.addAttribute("version", configVersion);
        return "products";
    }
}