package com.imooc.api;

import com.imooc.entity.Product;
import org.springframework.data.domain.Page;

public interface ProductRpc {


    Page<Product> query(Product req);

    Product findOne(String id);

}
