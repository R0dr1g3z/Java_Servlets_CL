package com.example.web;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet11", urlPatterns = "/servlet11")
public class Servlet11 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Hello first servlet");
        response.getWriter().append("Content11\n");
        response.getWriter().append("SERVLET WORKS !!!");
    }
}
