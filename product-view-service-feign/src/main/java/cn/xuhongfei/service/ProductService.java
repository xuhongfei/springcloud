package cn.xuhongfei.service;

import cn.xuhongfei.client.ProductClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductClientFeign productClientFeign;

    public String products() {
        return productClientFeign.products();
    }
}
