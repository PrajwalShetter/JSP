package com.xworkz.omniroute.servlet;

import com.xworkz.omniroute.dto.UserDto;
import com.xworkz.omniroute.service.UserRegistrationService;
import com.xworkz.omniroute.service.impl.UserRegistrationServiceImpl;

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
        String dispatcherId = req.getParameter("dispatcherId");
        String hubName = req.getParameter("hubName");
        String operatingRadiusStr = req.getParameter("operatingRadius");
        String fleetType = req.getParameter("fleetType");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        double operatingRadius = 0.0;
        if (operatingRadiusStr != null && !operatingRadiusStr.trim().isEmpty()) {
            operatingRadius = Double.parseDouble(operatingRadiusStr);
        }

        UserDto userDto = new UserDto();
        userDto.setDispatcherId(dispatcherId);
        userDto.setHubName(hubName);
        userDto.setOperatingRadius(operatingRadius);
        userDto.setFleetType(fleetType);
        userDto.setPassword(password);
        userDto.setConPassword(confirmPassword);

        userRegistrationService.saveUser(userDto);

        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.println("Thanks for Registration");
    }
}
