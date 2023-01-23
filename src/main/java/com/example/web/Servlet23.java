package com.example.web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet23")
public class Servlet23 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        Path path = Paths.get("/home/r0dr1g3z/Desktop/Java_powtorka/Java_servlets_CL/oop.txt");
        List<String> list = Files.readAllLines(path);
        for (String s : list){
            resp.getWriter().println(s);
        }
    }
}
