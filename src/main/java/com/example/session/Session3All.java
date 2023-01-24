package com.example.session;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/showAllSession")
public class Session3All extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sess = req.getSession();
        Map<String, String> map = (Map<String, String>) sess.getAttribute("map");
        for (String key : map.keySet()){
            resp.getWriter().println(key + " " + map.get(key));
        }

        // Enumeration<String> sessions = sess.getAttributeNames();
        // while(sessions.hasMoreElements()){
        //     String key = sessions.nextElement();
        //     resp.getWriter().println(key + " " + sess.getAttribute(key));
        // }
    }
}
