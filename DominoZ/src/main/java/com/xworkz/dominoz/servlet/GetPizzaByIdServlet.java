package com.xworkz.dominoz.servlet;

import com.xworkz.dominoz.dto.PizzaDto;
import com.xworkz.dominoz.service.PizzaService;
import com.xworkz.dominoz.service.impl.pizzaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/editPizza")
public class GetPizzaByIdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PizzaService pizzaService = new pizzaServiceImpl();
        PizzaDto pizzaDto=pizzaService.getPizzaById(Integer.parseInt(req.getParameter("id")));
        req.setAttribute("pizzaUpdate",pizzaDto);
        req.getRequestDispatcher("updatePizza.jsp").forward(req,resp);
    }
}
