package com.xworkz.dominoz.servlet;

import com.xworkz.dominoz.dto.PizzaMakeDto;
import com.xworkz.dominoz.service.PizzaMakeService;
import com.xworkz.dominoz.service.impl.PizzaMakeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/pizzaMaker")
public class SavePizzaMakerServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PizzaMakeService pizzaMakeService = new PizzaMakeServiceImpl();

        String pizzaName = req.getParameter("pizzaName");
        String empName = req.getParameter("empName");
        PizzaMakeDto pizzaMakeDto = new PizzaMakeDto();
        pizzaMakeDto.setPizzaName(pizzaName);
        pizzaMakeDto.setEmployeeName(empName);

        if(pizzaName != null && !pizzaName.isEmpty() && empName != null && !empName.isEmpty()) {
            pizzaMakeService.savePizzaMaker(pizzaMakeDto);
        }

        resp.sendRedirect("makePizza");

    }
}
