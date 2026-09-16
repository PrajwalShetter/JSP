package com.xworkz.dominoz.servlet;

import com.xworkz.dominoz.constants.Category;
import com.xworkz.dominoz.constants.Size;
import com.xworkz.dominoz.dto.PizzaDto;
import com.xworkz.dominoz.service.PizzaService;
import com.xworkz.dominoz.service.impl.pizzaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updatePizza")
public class UpdatePizzaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PizzaService pizzaService = new pizzaServiceImpl();

        PizzaDto pizzaDto = new PizzaDto();
        pizzaDto.setSize(Size.valueOf(req.getParameter("size")));
        pizzaDto.setId((Integer.parseInt(req.getParameter("id"))));
        pizzaDto.setName(req.getParameter("name"));
        pizzaDto.setPrice(Double.parseDouble(req.getParameter("price")));
        pizzaDto.setCategory(Category.valueOf(req.getParameter("category")));

        pizzaService.updatePizzaById(pizzaDto);

        resp.sendRedirect("viewAllPizza");


    }
}
