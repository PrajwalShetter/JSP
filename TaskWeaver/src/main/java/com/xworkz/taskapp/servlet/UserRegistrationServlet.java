package com.xworkz.taskapp.servlet;

import com.xworkz.taskapp.Dto.UserDto;
import com.xworkz.taskapp.service.UserRegistrationService;
import com.xworkz.taskapp.service.impl.UserRegistrationServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register")
public class UserRegistrationServlet extends GenericServlet {

    private UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String userId = req.getParameter("userId");
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String workspaceCode = req.getParameter("workspaceCode");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        UserDto userDto = new UserDto();
        userDto.setUserId(userId);
        userDto.setFullName(fullName);
        userDto.setEmail(email);
        userDto.setWorkspaceCode(workspaceCode);
        userDto.setPassword(password);
        userDto.setConfirmPassword(confirmPassword);

        userRegistrationService.saveUser(userDto);

        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.println("Thanks for Registration");
    }
}
