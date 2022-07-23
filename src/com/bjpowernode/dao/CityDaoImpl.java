package com.bjpowernode.dao;

import com.bjpowernode.bean.City;
import com.bjpowernode.util.DBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CityDaoImpl implements CityDao{
    @Override
    public List<City> selectById(int id) {
        QueryRunner qr = new QueryRunner(DBUtil.getDs());
        String sql = "select id , name from city where country_id = ? ";
        List<City> list = null;
        try {

            list = qr.query(sql,new BeanListHandler<>(City.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
