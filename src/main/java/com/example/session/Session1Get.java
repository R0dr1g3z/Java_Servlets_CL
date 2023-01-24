package com.example.session;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/getSession")
public class Session1Get extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        Integer counter = (Integer) session.getAttribute("counter");
        if (null == counter) {
            resp.getWriter().println("EMPTY");
        } else {
            resp.getWriter().println(counter);
            counter++;
            session.setAttribute("counter", counter);
        }
    }
}
