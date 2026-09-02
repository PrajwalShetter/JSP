package com.xworkz.apexLog.servlet;

import com.xworkz.apexLog.dto.UserDto;
import com.xworkz.apexLog.service.UserRegistrationService;
import com.xworkz.apexLog.service.impl.UserRegistrationServiceImpl;

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
        String id = req.getParameter("id");
        String userName = req.getParameter("userName");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String accountType = req.getParameter("accountType");

        UserDto userDto = new UserDto();
        userDto.setAccountType(accountType);
        userDto.setUserName(userName);
        userDto.setId(Integer.parseInt(id));
        userDto.setGender(gender);
        userDto.setEmail(email);


        boolean update = userRegistrationService.updateAccount(userDto);

        req.setAttribute("updateDto",update);
        resp.sendRedirect("updateAccount.jsp");


    }
}
