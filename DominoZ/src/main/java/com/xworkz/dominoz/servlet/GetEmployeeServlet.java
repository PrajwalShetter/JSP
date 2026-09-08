package com.xworkz.dominoz.servlet;

import com.xworkz.dominoz.dto.EmployeeDto;
import com.xworkz.dominoz.service.EmployeeService;
import com.xworkz.dominoz.service.impl.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/editEmployee")
public class GetEmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EmployeeService employeeService = new EmployeeServiceImpl();
        String id=req.getParameter("id");
        EmployeeDto employeeDto=employeeService.getEmployeeById(Integer.parseInt(id));

        req.setAttribute("dto",employeeDto);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("updateEmployee.jsp");
        requestDispatcher.forward(req,resp);
    }
}
