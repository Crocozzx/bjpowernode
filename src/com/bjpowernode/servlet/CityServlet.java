package com.bjpowernode.servlet;

import com.bjpowernode.bean.City;
import com.bjpowernode.service.CityService;
import com.bjpowernode.service.CityServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CityServlet")
public class CityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        CityService cs = new CityServiceImpl();
        List<City> cities = cs.selectById(Integer.parseInt(id));
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString(cities);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(s);

    }
}
