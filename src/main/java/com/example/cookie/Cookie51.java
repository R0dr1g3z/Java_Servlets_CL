package com.example.cookie;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie51")
public class Cookie51 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie cookie = new Cookie("cookie51", "1");
        resp.addCookie(cookie);
        resp.getWriter().println("<a href=\"http://localhost:8080/demo-1.0/cookie52\">Cookie 52 site</a>");
    }
}
