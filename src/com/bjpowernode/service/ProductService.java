package com.bjpowernode.service;

import com.bjpowernode.bean.Product;

import java.util.List;

public interface ProductService {
    //模糊查询
    List<Product> selectByLike(String name);
}
