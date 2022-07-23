package com.bjpowernode.service;

import com.bjpowernode.bean.Country;

import java.util.List;

public interface CountryService {

    //查询全部数据
    List<Country> selectAll();
}
