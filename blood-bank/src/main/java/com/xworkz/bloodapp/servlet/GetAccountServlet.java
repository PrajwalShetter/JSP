package com.xworkz.bloodapp.servlet;

import com.xworkz.bloodapp.dto.UserDto;
import com.xworkz.bloodapp.service.UserRegistrationService;
import com.xworkz.bloodapp.service.impl.UserRegistrationServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/getAccount")
public class GetAccountServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
        String id = req.getParameter("id");
        UserDto userDto = userRegistrationService.getUser(id);
//        System.out.println(userDto);

        req.setAttribute("dto", userDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAccount.jsp");
        requestDispatcher.forward(req, res);

    }
}
