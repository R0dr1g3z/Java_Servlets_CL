package com.example.get;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get2")
public class Get2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String key : parameterMap.keySet()) {
            response.getWriter().append(key + "\n");
            response.getWriter().append(Arrays.toString(parameterMap.get(key)) + "\n");
        }
    }
}
