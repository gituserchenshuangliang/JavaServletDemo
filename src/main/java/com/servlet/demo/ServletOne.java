package com.servlet.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/one")
public class ServletOne extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    public void init() throws ServletException {
        System.out.println("INIT");
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        
    }
    
    @Override
    public void destroy() {
        
    }
}
