package com.xworkz.youtube.servlet;

import com.xworkz.youtube.dto.UserDto;
import com.xworkz.youtube.service.UserService;
import com.xworkz.youtube.service.impl.UserServiceImpl;

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

        UserService userService = new UserServiceImpl();

        UserDto userDto = new UserDto();
        userDto.setId(Integer.parseInt(req.getParameter("id")));
        userDto.setCategory(req.getParameter("category"));
        userDto.setHandle(req.getParameter("handle"));
        userDto.setChannelName(req.getParameter("channelName"));
        userDto.setEmail(req.getParameter("email"));

        userService.updateAccount(userDto);

        resp.sendRedirect("viewAllUsers");

    }
}
