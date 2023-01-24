package com.example.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet34")
public class Servlet34 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        Cookie cookie = giveCookie(cookies, "visits");
        if (cookie == null){
            Cookie cookie2 = new Cookie("visits", "1");
            cookie2.setMaxAge(31536000);
            resp.addCookie(cookie2);
            resp.getWriter().println("Welcome first time on our site");
        } else {
            resp.getWriter().println("Welcome you are visit us " + cookie.getValue() + " times");
            int cookieVal = Integer.parseInt(cookie.getValue());
            cookieVal++;
            cookie.setValue(String.valueOf(cookieVal));
            resp.addCookie(cookie);
        }
    }

    private static Cookie giveCookie(Cookie[] cookies, String cookie){
        for (Cookie c : cookies){
            if (c.getName().equals(cookie)){
                return c;
            }
        }
        return null;
    }
}
