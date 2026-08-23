package com.xworkz.guardrail.servlet;

import com.xworkz.guardrail.dto.UserDto;
import com.xworkz.guardrail.service.UserService;
import com.xworkz.guardrail.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class UserSaveServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserService userService = new UserServiceImpl();

        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String complianceLevel = req.getParameter("complianceLevel");
        String nodeCode = req.getParameter("nodeCode");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        UserDto userDto = new UserDto();
        userDto.setEmail(email);
        userDto.setPassword(password);
        userDto.setUsername(username);
        userDto.setNodeCode(nodeCode);
        userDto.setComplianceLevel(complianceLevel);
        userDto.setConfirmPassword(confirmPassword);

        userService.saveUser(userDto);

        resp.getWriter().println("Thanks for Register");

    }
}
