package com.example.cookie;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeCookie")
public class Cookie4Del extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        Cookie[] cookies = req.getCookies();
        for (Cookie c : cookies){
            if (c.getName().equals(name)){
                c.setMaxAge(0);
                resp.addCookie(c);
            }
        }
        resp.sendRedirect("showAllCookies");
    }
}
