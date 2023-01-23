package com.example.get;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get4")
public class Get4 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String comapny = req.getParameter("company");
        String[] learn = req.getParameterValues("learn");
        resp.getWriter().append("Comapny:\n");
        resp.getWriter().append("- " + comapny + "\n");
        resp.getWriter().append("Learn:\n");
        for (int i = 0; i < learn.length; i++) {
            resp.getWriter().append("- " + learn[i] + "\n");
        }
    }
}
