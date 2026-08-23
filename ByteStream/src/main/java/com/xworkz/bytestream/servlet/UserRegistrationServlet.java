package com.xworkz.bytestream.servlet;

import com.xworkz.bytestream.dto.UserDto;
import com.xworkz.bytestream.service.UserRegistrationService;
import com.xworkz.bytestream.service.impl.UserRegistrationServiceImpl;

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

        String email = req.getParameter("email");
//        String streamerId = req.getParameter("streamerId");
        String channelName = req.getParameter("channelName");
        String serverRegion = req.getParameter("serverRegion");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        UserDto userDto = new UserDto();
        userDto.setChannelName(channelName);
        userDto.setConPassword(confirmPassword);
        userDto.setEmail(email);
        userDto.setNodeRegion(serverRegion);
//        userDto.setStreamId(Integer.parseInt(streamerId));
        userDto.setPassword(password);

        UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
        userRegistrationService.saveUser(userDto);

        res.getWriter().println("thanks for registration");


    }
}
