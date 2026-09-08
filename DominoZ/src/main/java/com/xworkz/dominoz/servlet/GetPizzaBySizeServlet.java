package com.xworkz.dominoz.servlet;

import com.xworkz.dominoz.constants.Size;
import com.xworkz.dominoz.dto.PizzaDto;
import com.xworkz.dominoz.service.PizzaService;
import com.xworkz.dominoz.service.impl.pizzaServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/getPizzaBySize")
public class GetPizzaBySizeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PizzaService pizzaService = new pizzaServiceImpl();
        String size= req.getParameter("size");
        List<PizzaDto> pizzaDtos =pizzaService.getPizzaBySize(Size.valueOf(size));

        req.setAttribute("sizeDto", pizzaDtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewAllPizza.jsp");
        requestDispatcher.forward(req,resp);
    }
}
