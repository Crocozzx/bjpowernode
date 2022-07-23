package com.bjpowernode.service;

import com.bjpowernode.bean.Product;
import com.bjpowernode.dao.ProductDao;
import com.bjpowernode.dao.ProductDaoImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductDao pd = new ProductDaoImpl();
    @Override
    public List<Product> selectByLike(String name) {
        return pd.selectByLike(name);
    }
}
