package com.xworkz.dominoz.servlet;

import com.xworkz.dominoz.constants.Category;
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
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/overAllFilter")
public class PizzaFilterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String category= req.getParameter("category");

        Category category1 = null;
        if(category!= null && !category.isEmpty()){
             category1=Category.valueOf(category);
        }
        String price= req.getParameter("price");
        Double price1=null;
        if(price!= null && !price.isEmpty()){
            price1=Double.parseDouble(price);
        }

        String size = req.getParameter("size");
        Size size1=null;
        if(size!= null && !size.isEmpty()){
            size1=Size.valueOf(size);
        }

        PizzaService pizzaService = new pizzaServiceImpl();
        List<PizzaDto> pizzaDtos = pizzaService.getPizzaByPriceAndSizeAndCategory(price1,size1,category1);

        req.setAttribute("filterDto", pizzaDtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewAllPizza.jsp");
        requestDispatcher.forward(req,resp);

    }
}
