package com.example.cookie;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showAllCookies")
public class Cookie4Show extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie c : cookies) {
            resp.getWriter().println("<p>" + c.getName() + "<a href=\"http://localhost:8080/demo-1.0/removeCookie?name="
                    + c.getName() + "\"> DELETE THIS COOKIE </a></p>");
        }
    }
}
