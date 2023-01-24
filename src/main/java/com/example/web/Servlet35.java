package com.example.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet35")
public class Servlet35 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] numbers = req.getParameterValues("num");
        int sum = 0;
        int multi = 1;
        resp.getWriter().println("Numbers:");
        for (String s : numbers){
            int i = Integer.parseInt(s);
            sum += i;
            multi *= i;
            resp.getWriter().println("x" + s);
        }
        int avg = sum / numbers.length;
        resp.getWriter().println("Average:\n" + avg);
        resp.getWriter().println("Sum:\n" + sum);
        resp.getWriter().println("Multiplier:\n" + multi);
    }
}
