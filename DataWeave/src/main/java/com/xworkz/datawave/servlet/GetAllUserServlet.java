package com.xworkz.datawave.servlet;

import com.xworkz.datawave.dto.UserDto;
import com.xworkz.datawave.service.UserRegistrationService;
import com.xworkz.datawave.service.impl.UserRegistrationServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/ViewAllUsers")
public class GetAllUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();

        List<UserDto> userDtos =userRegistrationService.getAllUsers();
        System.out.println(userDtos);

        req.setAttribute("dtos",userDtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewAllUsers.jsp");
        requestDispatcher.forward(req,resp);
    }
}
