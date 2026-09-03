package com.xworkz.bloodapp.servlet;

import com.xworkz.bloodapp.dto.UserDto;
import com.xworkz.bloodapp.service.UserRegistrationService;
import com.xworkz.bloodapp.service.impl.UserRegistrationServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/fetchAccount")
public class fetchAccountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserRegistrationService userRegistrationService= new UserRegistrationServiceImpl();
        String id=req.getParameter("id");
        UserDto userDto = userRegistrationService.getUser(Integer.parseInt(id));

        req.setAttribute("updateDto", userDto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateUser.jsp");
        requestDispatcher.forward(req, resp);

    }
}
