package com.xworkz.dominoz.servlet;

import com.xworkz.dominoz.constants.Category;
import com.xworkz.dominoz.dto.PizzaOrderDto;
import com.xworkz.dominoz.service.PizzaOrderService;
import com.xworkz.dominoz.service.impl.PizzaOrderServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/orderPizza", loadOnStartup = +1)
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PizzaOrderService pizzaOrderService = new PizzaOrderServiceImpl();

        String name = req.getParameter("name");
        String phone= req.getParameter("phone");
        String category= req.getParameter("category");
        String pizzaName = req.getParameter("pizzaName");

        PizzaOrderDto pizzaOrderDto = new PizzaOrderDto();
        pizzaOrderDto.setPizzaName(pizzaName);
        pizzaOrderDto.setCategory(Category.valueOf(category));
        pizzaOrderDto.setPhone(Long.parseLong(phone));
        pizzaOrderDto.setUserName(name);

       pizzaOrderService.saveOrder(pizzaOrderDto);

        resp.getWriter().println("Thanks for ordering");


    }
}
