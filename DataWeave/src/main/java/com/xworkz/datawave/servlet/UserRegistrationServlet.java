package com.xworkz.datawave.servlet;

import com.xworkz.datawave.dto.UserDto;
import com.xworkz.datawave.service.UserRegistrationService;
import com.xworkz.datawave.service.impl.UserRegistrationServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register")
public class UserRegistrationServlet extends GenericServlet {

    private UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        String pipelineId = req.getParameter("pipelineId");
        String streamName = req.getParameter("streamName");
        String email = req.getParameter("email");
        String dataSchema = req.getParameter("dataSchema");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        UserDto userDto = new UserDto();
//        userDto.setPipelineId(Integer.parseInt(pipelineId));
        userDto.setStreamName(streamName);
        userDto.setEmail(email);
        userDto.setDataSchema(dataSchema);
        userDto.setPassword(password);
        userDto.setConfirmPassword(confirmPassword);

        userRegistrationService.saveUser(userDto);

        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        printWriter.println("Thanks for Registration");
    }
}
