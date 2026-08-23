package com.xworkz.fintrack.servlet;

import com.xworkz.fintrack.dto.UserDto;
import com.xworkz.fintrack.service.UserService;
import com.xworkz.fintrack.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/getUser")
public class GetUserServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        UserService userService = new UserServiceImpl();
        String id = req.getParameter("id");
        UserDto userDto = userService.getUser(Integer.parseInt(id));

        req.setAttribute("dto", userDto);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/getUser.jsp");
        requestDispatcher.forward(req, res);
    }
}
