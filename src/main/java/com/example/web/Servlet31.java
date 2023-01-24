package com.example.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet31")
public class Servlet31 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double number = Double.parseDouble(req.getParameter("number"));
        String convert = req.getParameter("convert");
        switch (convert) {
            case "EUR-USD":
                number *= 1.5;
                break;

            case "USD-EUR":
                number *= 0.5;
                break;

            default:
                break;
        }
        resp.getWriter().println(number);
    }
}
