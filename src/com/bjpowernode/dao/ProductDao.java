package com.bjpowernode.dao;

import com.bjpowernode.bean.Product;

import java.util.List;

public interface ProductDao {
    //模糊查询
    List<Product> selectByLike(String name);
}
