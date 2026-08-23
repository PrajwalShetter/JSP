package com.xworkz.youtube.servlet;

import com.xworkz.youtube.dto.UserDto;
import com.xworkz.youtube.service.UserService;
import com.xworkz.youtube.service.impl.UserServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class UserServlet extends GenericServlet {

    UserService userService = new UserServiceImpl();
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        String handle = req.getParameter("handle");
        String channelName = req.getParameter("channelName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String category = req.getParameter("category");
        String confirmPassword = req.getParameter("confirmPassword");

        UserDto userDto = new UserDto();
        userDto.setHandle(handle);
        userDto.setCategory(category);
        userDto.setEmail(email);
        userDto.setChannelName(channelName);
        userDto.setPassword(password);
        userDto.setConPassword(confirmPassword);

        userService.saveUser(userDto);

        res.getWriter().println("thanks for registration");
    }
}
