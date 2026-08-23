package com.xworkz.fintrack.servlet;

import com.xworkz.fintrack.dto.UserDto;
import com.xworkz.fintrack.service.UserService;
import com.xworkz.fintrack.service.impl.UserServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register")
public class UserServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        String username = req.getParameter("username");
        String monthlyIncome = req.getParameter("monthlyIncome");
        String savingsGoal = req.getParameter("savingsGoal");
        String currency = req.getParameter("currency");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        UserDto userDto = new UserDto();
        userDto.setUserName(username);
        userDto.setCurrency(currency);
        userDto.setIncome(Double.parseDouble(monthlyIncome));
        userDto.setSaving(Double.parseDouble(savingsGoal));
        userDto.setPassword(password);
        userDto.setConPassword(confirmPassword);

        UserService userService = new UserServiceImpl();
        userService.saveUser(userDto);
        System.out.println(userDto);

        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.println("Thanks for Registration");
    }
}
