package com.xworkz.edupulse.servlet;

import com.xworkz.edupulse.dto.StudentDto;
import com.xworkz.edupulse.service.StudentService;
import com.xworkz.edupulse.service.impl.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/getUser")
public class GetUserServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        StudentService studentService = new StudentServiceImpl();
        String id = req.getParameter("id");
        StudentDto studentDto = studentService.getStudent(Integer.parseInt(id));

        req.setAttribute("dto", studentDto);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/getUser.jsp");
        requestDispatcher.forward(req, res);

    }
}
