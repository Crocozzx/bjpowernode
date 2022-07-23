package com.bjpowernode.servlet;

import com.bjpowernode.bean.Country;
import com.bjpowernode.service.CountryService;
import com.bjpowernode.service.CountryServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CountryServlet")
public class CountryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //我需要的是查出来全部的数据，
        CountryService cs = new CountryServiceImpl();
        List<Country> list = cs.selectAll();
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString(list);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(s);

    }
}
