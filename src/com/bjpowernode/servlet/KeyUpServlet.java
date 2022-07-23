package com.bjpowernode.servlet;

import com.bjpowernode.bean.Product;
import com.bjpowernode.service.ProductService;
import com.bjpowernode.service.ProductServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/KeyUpServlet")
public class KeyUpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("value");
        ProductService pd = new ProductServiceImpl();
        List<Product> products = pd.selectByLike(value);
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString(products);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(s);
    }
}
