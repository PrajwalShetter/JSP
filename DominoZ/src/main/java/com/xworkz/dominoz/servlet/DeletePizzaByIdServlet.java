package com.xworkz.dominoz.servlet;

import com.xworkz.dominoz.service.PizzaService;
import com.xworkz.dominoz.service.impl.pizzaServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deletePizza")
public class DeletePizzaByIdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PizzaService pizzaService = new pizzaServiceImpl();
        String id = req.getParameter("id");
        pizzaService.deletePizzaById(Integer.parseInt(id));

        resp.sendRedirect("viewAllPizza");


    }

}
