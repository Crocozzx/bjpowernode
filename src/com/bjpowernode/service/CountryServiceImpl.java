package com.bjpowernode.service;

import com.bjpowernode.bean.Country;
import com.bjpowernode.dao.CountryDao;
import com.bjpowernode.dao.CountryDaoImpl;

import java.util.List;

public class CountryServiceImpl implements CountryService{
    private CountryDao cd = new CountryDaoImpl();
    @Override
    public List<Country> selectAll() {
        return cd.selectAll();
    }
}
