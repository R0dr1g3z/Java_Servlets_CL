package com.example.form;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form3")
public class Form3 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int number = Integer.parseInt(req.getParameter("number"));
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                resp.getWriter().println(i);
            }
        }
    }

}
