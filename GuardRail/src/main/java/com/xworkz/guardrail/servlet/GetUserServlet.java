package com.xworkz.guardrail.servlet;

import com.xworkz.guardrail.dto.UserDto;
import com.xworkz.guardrail.service.UserService;
import com.xworkz.guardrail.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getUser")
public class GetUserServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    UserService userService = new UserServiceImpl();
        String id = req.getParameter("id");
        UserDto userDto =  userService.getUser(Integer.parseInt(id));

        req.setAttribute("dto",userDto);
        RequestDispatcher requestDispatcher =req.getRequestDispatcher("getUser.jsp");
        requestDispatcher.forward(req, res);


    }
}
