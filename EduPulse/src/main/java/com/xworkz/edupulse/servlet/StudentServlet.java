package com.xworkz.edupulse.servlet;

import com.xworkz.edupulse.dto.StudentDto;
import com.xworkz.edupulse.service.StudentService;
import com.xworkz.edupulse.service.impl.StudentServiceImpl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class StudentServlet extends GenericServlet {


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        String rollNumber  = req.getParameter("rollNumber");
        String studentName  = req.getParameter("studentName");
        String email  = req.getParameter("email");
        String semester  = req.getParameter("semester");
        String password  = req.getParameter("password");
        String confirmPassword  = req.getParameter("confirmPassword");

        StudentDto studentDto = new StudentDto();
        studentDto.setStudentName(studentName);
        studentDto.setRollNumber(rollNumber);
        studentDto.setEmail(email);
        studentDto.setSemester(semester);
        studentDto.setPassword(password);
        studentDto.setConPassword(confirmPassword);

        StudentService studentService = new StudentServiceImpl();
        studentService.saveStudent(studentDto);

        res.getWriter().println("thank you for register");


    }
}
