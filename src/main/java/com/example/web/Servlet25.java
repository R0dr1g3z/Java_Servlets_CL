package com.example.web;

import java.io.IOException;
import java.util.Random;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet25")
public class Servlet25 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.getWriter().println("There is random numbers:");
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            resp.getWriter().println(r.nextInt(100));
        }
    }
    
}
