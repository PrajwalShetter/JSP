package com.xworkz.launchpad.servlet;

import com.xworkz.launchpad.dto.UserDto;
import com.xworkz.launchpad.service.UserRegistrationService;
import com.xworkz.launchpad.service.impl.UserRegistrationServiceImpl;

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
        String username = req.getParameter("username");
        String repoUrl = req.getParameter("repoUrl");
        String environment = req.getParameter("environment");
        String storageSizeStr = req.getParameter("storageSize");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        double storageSize = 0.0;
        if (storageSizeStr != null && !storageSizeStr.trim().isEmpty()) {
            storageSize = Double.parseDouble(storageSizeStr);
        }

        UserDto userDto = new UserDto();
        userDto.setUsername(username);
        userDto.setRepoUrl(repoUrl);
        userDto.setEnvironment(environment);
        userDto.setStorageSize(storageSize);
        userDto.setPassword(password);
        userDto.setConPassword(confirmPassword);

        userRegistrationService.saveUser(userDto);

        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.println("Thanks for Registration");
    }
}
