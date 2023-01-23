package com.example.cookie;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie3")
public class Cookie3 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String key = req.getParameter("key");
        String value = req.getParameter("value");
        int time = Integer.parseInt(req.getParameter("time"));
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(time * 3600);
        resp.addCookie(cookie);
    }
}
