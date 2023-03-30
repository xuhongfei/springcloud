package cn.xuhongfei.service;

import cn.xuhongfei.client.ProductClientRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    public String products() {
        return productClientRibbon.products();
    }
}
