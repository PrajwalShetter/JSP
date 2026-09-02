package com.xworkz.apexLog.servlet;

import com.xworkz.apexLog.dto.UserDto;
import com.xworkz.apexLog.service.UserRegistrationService;
import com.xworkz.apexLog.service.impl.UserRegistrationServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getUser")
public class GetUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
        String id = req.getParameter("id");
        UserDto userDto =userRegistrationService.getUser(Integer.parseInt(id));

        req.setAttribute("dto",userDto);
        RequestDispatcher requestDispatcher =req.getRequestDispatcher("/updateAccount.jsp");
        requestDispatcher.forward(req, resp);
    }


}
