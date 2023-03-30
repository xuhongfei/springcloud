package cn.xuhongfei.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductClientRibbon {
    @Autowired
    RestTemplate restTemplate;

    public String products() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products", String.class);
    }
}
