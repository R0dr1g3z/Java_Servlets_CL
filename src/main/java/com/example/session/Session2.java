package com.example.session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().append("<form method=\"post\"><input name='ocena'/></form>");
        resp.getWriter().append("<button>Send</button>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession sess = req.getSession();
        Integer score = Integer.parseInt(req.getParameter("ocena"));
        List<Integer> oceny = (List<Integer>) sess.getAttribute("oceny");
        if (oceny == null) {
            oceny = new ArrayList<>();
            sess.setAttribute("oceny", oceny);

        }
        oceny.add(score);
        Integer sum = 0;
        for (Integer i : oceny) {
            sum += i;
        }
        resp.getWriter().println("Sum all ratings: " + sum);
        resp.getWriter().println("Average: " + sum / oceny.size());
    }
}
