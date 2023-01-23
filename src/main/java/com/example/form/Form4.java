package com.example.form;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form4")
public class Form4 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int a = Integer.parseInt(req.getParameter("a"));
        int b = Integer.parseInt(req.getParameter("b"));
        int c = Integer.parseInt(req.getParameter("c"));
        int delta = b ^ 2 - 4 * a * c;
        if (delta < 0) {
            resp.getWriter().println("Delta is 0");
        } else {
            resp.getWriter().println("Delta is " + delta);
        }
    }
}
