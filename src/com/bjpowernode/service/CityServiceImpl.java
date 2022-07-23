package com.bjpowernode.service;

import com.bjpowernode.bean.City;
import com.bjpowernode.dao.CityDao;
import com.bjpowernode.dao.CityDaoImpl;

import java.util.List;

public class CityServiceImpl implements CityService{
    private CityDao cd = new CityDaoImpl();
    @Override
    public List<City> selectById(int id) {
        return cd.selectById(id);
    }
}
