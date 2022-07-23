package com.bjpowernode.dao;

import com.bjpowernode.bean.Country;
import com.bjpowernode.util.DBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CountryDaoImpl implements CountryDao{
    @Override
    public List<Country> selectAll() {
        QueryRunner qr = new QueryRunner(DBUtil.getDs());
        List<Country> list = null;
        String sql = "select * from country";
        try {
            list = qr.query(sql,new BeanListHandler<>(Country.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
