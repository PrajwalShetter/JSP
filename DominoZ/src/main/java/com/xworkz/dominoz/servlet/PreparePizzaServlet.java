package com.xworkz.dominoz.servlet;

import com.xworkz.dominoz.dto.EmployeeDto;
import com.xworkz.dominoz.dto.PizzaDto;
import com.xworkz.dominoz.service.EmployeeService;
import com.xworkz.dominoz.service.PizzaService;
import com.xworkz.dominoz.service.impl.EmployeeServiceImpl;
import com.xworkz.dominoz.service.impl.pizzaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/makePizza")
public class PreparePizzaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PizzaService pizzaService = new pizzaServiceImpl();
        EmployeeService employeeService = new EmployeeServiceImpl();

        List<PizzaDto> pizzaDto = pizzaService.getAllPizza();
        List<EmployeeDto> employeeDtos = employeeService.getEmployees();

        req.setAttribute("pizzas", pizzaDto);
        req.setAttribute("employees",employeeDtos);

        System.out.println(pizzaDto);
        System.out.println(employeeDtos);

        req.getRequestDispatcher("preparePizza.jsp").forward(req,resp);



    }
}
