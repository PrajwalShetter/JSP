package com.xworkz.bloodapp.servlet;

import com.xworkz.bloodapp.service.UserRegistrationService;
import com.xworkz.bloodapp.service.impl.UserRegistrationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class AccountDeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
        String id = req.getParameter("id");
        userRegistrationService.deleteUser(Integer.parseInt(id));

        resp.sendRedirect("viewUsers.jsp");

    }
}
