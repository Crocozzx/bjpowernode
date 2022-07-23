package com.bjpowernode.dao;

import com.bjpowernode.bean.City;

import java.util.List;

public interface CityDao {
    //多表查询，根据id查询
    List<City> selectById(int id);
}
