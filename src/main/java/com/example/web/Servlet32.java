package com.example.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet32")
public class Servlet32 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String number = req.getParameter("number");
        int sum = 0;
        if (number.matches("^[01]+$")){
            String[] arr = number.split("");
            int counter = arr.length - 1;
            for (String s : arr){
                int i = Integer.parseInt(s);
                sum += i * Math.pow(2, counter);
                counter--;
            }
            resp.getWriter().println(sum);
        }
        
    }
}
