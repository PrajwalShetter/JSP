package com.xworkz.quickdoc.servlet;

import com.xworkz.quickdoc.dto.UserDto;
import com.xworkz.quickdoc.service.UserRegistrationService;
import com.xworkz.quickdoc.service.impl.UserRegistrationServiceImpl;

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
        String doctorName = req.getParameter("doctorName");
        String experienceYearsStr = req.getParameter("experienceYears");
        String specialty = req.getParameter("specialty");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        double experienceYears = 0.0;
        if (experienceYearsStr != null && !experienceYearsStr.trim().isEmpty()) {
            experienceYears = Double.parseDouble(experienceYearsStr);
        }

        UserDto userDto = new UserDto();
        userDto.setLicenseNumber(licenseNumber);
        userDto.setDoctorName(doctorName);
        userDto.setExperienceYears(experienceYears);
        userDto.setSpecialty(specialty);
        userDto.setPassword(password);
        userDto.setConPassword(confirmPassword);

        userRegistrationService.saveUser(userDto);

        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.println("Thanks for Registration");
    }
}
