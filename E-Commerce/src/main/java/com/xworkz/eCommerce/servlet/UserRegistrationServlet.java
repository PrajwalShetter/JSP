package com.xworkz.eCommerce.servlet;

import com.xworkz.eCommerce.Dto.UserDto;
import com.xworkz.eCommerce.service.UserRegistrationService;
import com.xworkz.eCommerce.service.impl.UserRegistrationServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/registerBuyer")
public class UserRegistrationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        String email = req.getParameter("email");
        String userId   = req.getParameter("buyerId");
        String mobile = req.getParameter("mobile");
        String address = req.getParameter("address");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        UserDto userDto = new UserDto();
        userDto.setEmail(email);
        userDto.setAddress(address);
        userDto.setNumber(mobile);
        userDto.setConPassword(confirmPassword);
        userDto.setUsername(userId);
        userDto.setPassword(password);

        System.out.println(userDto);

        UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
        userRegistrationService.saveUser(userDto);

        res.getWriter().println("Thanks for register");
    }
}
