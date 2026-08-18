package com.xworkz.bloodapp.servlet;

import com.xworkz.bloodapp.dto.UserDto;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register")
public class AccountRegistrationServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        String email = req.getParameter("EmailId");
        String firstname    = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String bloodGroup = req.getParameter("bloodGroup");
        String userId = req.getParameter("UserId");
        String password = req.getParameter("password");
        String repeatPassword = req.getParameter("repeatPassword");


        UserDto userDto = new UserDto();
        userDto.setEmail(email);
        userDto.setFirstName(firstname);
        userDto.setLastName(lastname);
        userDto.setUserId(userId);
        userDto.setPassword(password);
        userDto.setBloodGroup(bloodGroup);
        userDto.setRepeatPassword(repeatPassword);



        System.out.println(userDto);

        PrintWriter printWriter = res.getWriter();
        printWriter.println("Thanks for Registration");

    }
}
