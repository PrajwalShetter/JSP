package com.xworkz.taskapp.servlet;

import com.xworkz.taskapp.Dto.UserDto;
import com.xworkz.taskapp.service.UserRegistrationService;
import com.xworkz.taskapp.service.impl.UserRegistrationServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getUser")
public class GetUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
        String id = req.getParameter("id");
        UserDto userDto = userRegistrationService.getUser(Integer.parseInt(id));

        req.setAttribute("dto", userDto);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getUser.jsp");
        requestDispatcher.forward(req,resp);
    }
}
