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

@WebServlet(urlPatterns = "/addPizza")
public class SavePizzaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PizzaService pizzaService = new pizzaServiceImpl();

        String name = req.getParameter("name");
        String size = req.getParameter("size");
        String category = req.getParameter("category");
        String  price = req.getParameter("price");


        PizzaDto pizzaDto = new PizzaDto();
        pizzaDto.setName(name);
        pizzaDto.setSize(Size.valueOf(size));
        pizzaDto.setCategory(Category.valueOf(category));
        pizzaDto.setPrice(Double.parseDouble(price));

        pizzaService.savePizza(pizzaDto);

        resp.getWriter().println("Pizza Added Successfully");
    }
}
