package com.xworkz.bloodapp.servlet;

import com.xworkz.bloodapp.dto.UserDto;
import com.xworkz.bloodapp.service.UserRegistrationService;
import com.xworkz.bloodapp.service.impl.UserRegistrationServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/register")
public class UserRegistrationServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        String email = req.getParameter("EmailId");
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String bloodGroup = req.getParameter("bloodGroup");
        String password = req.getParameter("password");
        String repeatPassword = req.getParameter("repeatPassword");


        UserDto user = new UserDto();
        user.setEmail(email);
        user.setRepeatPassword(repeatPassword);
        user.setBloodGroup(bloodGroup);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setPassword(password);

        System.out.println(user);

        UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
        boolean isValidate = userRegistrationService.saveUser(user);

        if(isValidate)
        res.getWriter().println("thank you for registration");
        else
            res.getWriter().println("sry");
    }


}
