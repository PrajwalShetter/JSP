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
import java.util.List;

@WebServlet(urlPatterns = "/viewAllEmployees")
public class GetAlEmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EmployeeService employeeService = new EmployeeServiceImpl();
        List<EmployeeDto> employeeDtos = employeeService.getEmployees();

        req.setAttribute("empDto", employeeDtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("EmployeeDetails.jsp");
        requestDispatcher.forward(req,resp);

    }
}
