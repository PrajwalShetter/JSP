package com.xworkz.apexLog.servlet;

import com.xworkz.apexLog.dto.UserDto;
import com.xworkz.apexLog.service.UserRegistrationService;
import com.xworkz.apexLog.service.impl.UserRegistrationServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/getAllUser")
public class GetAllUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
        List<UserDto> users = userRegistrationService.getAllUsers();


        req.setAttribute("dtos", users);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewUsers.jsp");
        requestDispatcher.forward(req,resp);

    }
}
