package com.example.session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session4")
public class Session4 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sess = req.getSession();
        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        CartItem cartItem = new CartItem(name, price, quantity);
        List<CartItem> cartItems = (List<CartItem>) sess.getAttribute("cartItems");
        if (cartItems == null) {
            cartItems = new ArrayList<>();
            sess.setAttribute("cartItems", cartItems);
        }
        cartItems.add(cartItem);
        sess.setAttribute("cartItems", cartItems);
        for (CartItem c : cartItems) {
            resp.getWriter().println(
                    String.format("Name: %s Price: %s Quantity: %s", c.getName(), c.getPrice(), c.getQuantity()));
        }
    }
}
