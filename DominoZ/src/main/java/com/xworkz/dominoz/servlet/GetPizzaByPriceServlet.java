package com.xworkz.dominoz.servlet;

import com.xworkz.dominoz.dto.PizzaDto;
import com.xworkz.dominoz.service.PizzaService;
import com.xworkz.dominoz.service.impl.pizzaServiceImpl;
import lombok.RequiredArgsConstructor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/getPizzaByPrice")
public class GetPizzaByPriceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PizzaService pizzaService = new pizzaServiceImpl();
        String price = req.getParameter("price");
        List<PizzaDto> pizzaDtos = pizzaService.getPizzaByPrize(Double.parseDouble(price));

        req.setAttribute("priceDto", pizzaDtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewAllPizza.jsp");
        requestDispatcher.forward(req,resp);

    }
}
