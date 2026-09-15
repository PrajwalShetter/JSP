package com.xworkz.dominoz.servlet;

import com.xworkz.dominoz.constants.Gender;
import com.xworkz.dominoz.dto.EmployeeDto;
import com.xworkz.dominoz.service.EmployeeService;
import com.xworkz.dominoz.service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet(urlPatterns = "/addEmployee")
public class SaveEmployeeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EmployeeService employeeService = new EmployeeServiceImpl();

        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName(req.getParameter("name"));
        employeeDto.setEmail(req.getParameter("email"));
        employeeDto.setPhone(Long.parseLong(req.getParameter("phone")));
        employeeDto.setAge(Integer.parseInt(req.getParameter("age")));
        employeeDto.setGender(Gender.valueOf(req.getParameter("gender")));
        employeeDto.setSalary(new BigDecimal(req.getParameter("salary")));
        employeeDto.setPassword(req.getParameter("password"));

        boolean save = employeeService.saveEmployee(employeeDto);
        req.setAttribute("dto",save);
        resp.sendRedirect("viewAllEmployees");

    }
}
