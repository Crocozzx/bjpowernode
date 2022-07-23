package com.bjpowernode.dao;

import com.bjpowernode.bean.Product;
import com.bjpowernode.util.DBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl implements ProductDao{
    @Override
    public List<Product> selectByLike(String name) {
        QueryRunner qr = new QueryRunner(DBUtil.getDs());
        String sql = "select * from product where productname like ?";
        List<Product> list = null;
        try {
            list = qr.query(sql,new BeanListHandler<>(Product.class),"%"+name+"%");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
