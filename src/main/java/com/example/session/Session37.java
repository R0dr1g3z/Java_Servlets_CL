package com.example.session;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session37")
public class Session37 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sess = req.getSession();
        Random r = new Random();
        int first = r.nextInt(1000 - 20) + 20;
        int second = r.nextInt(1000 - 20) + 20;
        sess.setAttribute("first", first);
        sess.setAttribute("second", second);
        resp.getWriter().println("<form method=\"post\">" +
                "" + first + " + " + second + " = <input type=\"text\" name=\"sum\" id=\"sum\"><br>" +
                "" + first + " - " + second + " = <input type=\"text\" name=\"sub\" id=\"sub\"><br>" +
                "" + first + " * " + second + " = <input type=\"text\" name=\"multi\" id=\"multi\">" +
                "<button>Send</button>" + 
                "</form>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sess = req.getSession();
        int first = (int) sess.getAttribute("first");
        int second = (int) sess.getAttribute("second");
        int sum = Integer.parseInt(req.getParameter("sum"));
        int sub = Integer.parseInt(req.getParameter("sub"));
        int multi = Integer.parseInt(req.getParameter("multi"));
        if (first + second == sum) {
            resp.getWriter().println(String.format("%s + %s = %s CORRECT", first, second, sum));
        } else {
            resp.getWriter().println(String.format("%s + %s = %s WRONG", first, second, sum));
        }
        if (first - second == sub) {
            resp.getWriter().println(String.format("%s - %s = %s CORRECT", first, second, sub));
        } else {
            resp.getWriter().println(String.format("%s - %s = %s WRONG", first, second, sub));
        }
        if (first * second == multi) {
            resp.getWriter().println(String.format("%s * %s = %s CORRECT", first, second, multi));
        } else {
            resp.getWriter().println(String.format("%s * %s = %s WRONG", first, second, multi));
        }
    }
}
