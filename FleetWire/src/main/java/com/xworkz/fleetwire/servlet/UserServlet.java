package com.xworkz.fleetwire.servlet;

import com.xworkz.fleetwire.dto.UserDto;
import com.xworkz.fleetwire.service.UserRegistrationService;
import com.xworkz.fleetwire.service.impl.UserRegistrationServiceImpl;

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
        String licenseNumber = req.getParameter("licenseNumber");
        String operatorName = req.getParameter("operatorName");
        String vehicleCapacityStr = req.getParameter("vehicleCapacity");
        String zoneCode = req.getParameter("zoneCode");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");



        UserDto userDto = new UserDto();
        userDto.setLicenseNumber(licenseNumber);
        userDto.setOperatorName(operatorName);
        userDto.setVehicleCapacity(Double.parseDouble(vehicleCapacityStr));
        userDto.setZoneCode(zoneCode);
        userDto.setPassword(password);
        userDto.setConPassword(confirmPassword);

        userRegistrationService.saveUser(userDto);

        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.println("Thanks for Registration");
    }
}
