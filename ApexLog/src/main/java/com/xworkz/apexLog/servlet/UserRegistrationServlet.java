package com.xworkz.apexLog.servlet;

import com.xworkz.apexLog.dto.UserDto;
import com.xworkz.apexLog.service.UserRegistrationService;
import com.xworkz.apexLog.service.impl.UserRegistrationServiceImpl;

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
        String userName = req.getParameter("userName");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String accountType = req.getParameter("accountType");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        UserDto userDto = new UserDto();
        userDto.setUserName(userName);
        userDto.setEmail(email);
        userDto.setGender(gender);
        userDto.setAccountType(accountType);
        userDto.setPassword(password);
        userDto.setConfirmPassword(confirmPassword);

        userRegistrationService.saveUser(userDto);

        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.println("Thanks for Registration");
    }
}
