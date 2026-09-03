package com.xworkz.bloodapp.servlet;

import com.xworkz.bloodapp.dto.UserDto;
import com.xworkz.bloodapp.service.UserRegistrationService;
import com.xworkz.bloodapp.service.impl.UserRegistrationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateAccount")
public class UpdateAccountServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
        String id= req.getParameter("id");
        String firstname= req.getParameter("firstname");
        String lastname= req.getParameter("lastname");
        String bloodGroup = req.getParameter("bloodGroup");
        String  emailId= req.getParameter("EmailId");

        UserDto userDto = new UserDto();
        userDto.setUserId(Integer.parseInt(id));
        userDto.setFirstname(firstname);
        userDto.setLastname(lastname);
        userDto.setBloodGroup(bloodGroup);
        userDto.setEmail(emailId);

        boolean update=userRegistrationService.updateAccount(userDto);

        req.setAttribute("updateDto",update);

        resp.sendRedirect("viewUsers");

    }
}
