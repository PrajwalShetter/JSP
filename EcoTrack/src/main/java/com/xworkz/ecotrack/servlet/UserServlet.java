package com.xworkz.ecotrack.servlet;

import com.xworkz.ecotrack.dto.UserDto;
import com.xworkz.ecotrack.service.UserService;
import com.xworkz.ecotrack.service.impl.UserServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/register")
public class UserServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        String facilityCode = req.getParameter("facilityCode");
        String orgName = req.getParameter("orgName");
        String industryType = req.getParameter("industryType");
        String carbonCap = req.getParameter("carbonCap");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");


        UserService userService =new UserServiceImpl();
        UserDto userDto = new UserDto();
        userDto.setCarbonCap(Double.parseDouble(carbonCap));
        userDto.setPassword(password);
        userDto.setOrgName(orgName);
        userDto.setIndustryType(industryType);
        userDto.setFacilityCode(facilityCode);
        userDto.setConfirmPassword(confirmPassword);
        userService.saveUser(userDto);

        res.getWriter().println("thanks for register");


    }
}
