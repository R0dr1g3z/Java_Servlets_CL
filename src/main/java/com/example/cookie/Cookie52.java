package com.example.cookie;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie52")
public class Cookie52 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie[] cookies = req.getCookies();
        int currency = 0;
        for (Cookie c : cookies) {
            currency++;
            if (c.getName().equals("cookie51")) {
                c.setMaxAge(0);
                resp.addCookie(c);
                resp.getWriter().println("Welcome on site Cookie 52");
            } else if (cookies.length == currency) {
                resp.sendRedirect("cookie51");
            }
        }
    }
}
