package com.xworkz.syncsphere.servlet;

import com.xworkz.syncsphere.dto.UserDto;
import com.xworkz.syncsphere.service.UserRegistrationService;
import com.xworkz.syncsphere.service.impl.UserRegistrationServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register")
public class UserServlet extends GenericServlet {

    private UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String email = req.getParameter("email");
        String teamName = req.getParameter("teamName");
        String maxMembersStr = req.getParameter("maxMembers");
        String securityLevel = req.getParameter("securityLevel");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        double maxMembers = 0.0;
        if (maxMembersStr != null && !maxMembersStr.trim().isEmpty()) {
            maxMembers = Double.parseDouble(maxMembersStr);
        }

        UserDto userDto = new UserDto();
        userDto.setEmail(email);
        userDto.setTeamName(teamName);
        userDto.setMaxMembers(maxMembers);
        userDto.setSecurityLevel(securityLevel);
        userDto.setPassword(password);
        userDto.setConPassword(confirmPassword);

        userRegistrationService.saveUser(userDto);

        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.println("Thanks for Registration");
    }
}
