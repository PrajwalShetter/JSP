package com.xworkz.apexLog.servlet;

import com.xworkz.apexLog.dto.UserDto;
import com.xworkz.apexLog.service.UserRegistrationService;
import com.xworkz.apexLog.service.impl.UserRegistrationServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/getUser")
public class GetUserServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
        String id = req.getParameter("id");
        UserDto userDto =userRegistrationService.getUser(Integer.parseInt(id));

        req.setAttribute("dto",userDto);
        RequestDispatcher requestDispatcher =req.getRequestDispatcher("/getUser.jsp");
        requestDispatcher.forward(req, res);

    }
}
