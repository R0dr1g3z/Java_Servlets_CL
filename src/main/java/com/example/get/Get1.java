package com.example.get;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get1")
public class Get1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int start = Integer.parseInt(request.getParameter("start"));
            int end = Integer.parseInt(request.getParameter("end"));
            List<Integer> list = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                list.add(i);
            }
            response.getWriter().append(list.toString());
        } catch (NumberFormatException e) {
            response.getWriter().append("NULL");
        }
    }
}
