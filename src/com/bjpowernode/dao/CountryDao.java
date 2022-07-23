package com.bjpowernode.dao;

import com.bjpowernode.bean.Country;

import java.util.List;

public interface CountryDao {
    //查询全部数据
    List<Country> selectAll();
}
