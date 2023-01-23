package com.example.get;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get3")
public class Get3 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int width = 5;
        int height = 10;
        try {
            width = Integer.parseInt(req.getParameter("width"));
            height = Integer.parseInt(req.getParameter("height"));
        } catch (NumberFormatException e) {
        }

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                resp.getWriter().print(j * i + " | ");
            }
            resp.getWriter().println();
        }
    }
}
