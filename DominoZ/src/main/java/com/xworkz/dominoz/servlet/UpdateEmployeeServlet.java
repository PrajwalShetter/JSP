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

@WebServlet(urlPatterns = "/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EmployeeService employeeService= new EmployeeServiceImpl();
        String id= req.getParameter("id");
        String name= req.getParameter("name");
        String email= req.getParameter("email");
        String phone= req.getParameter("phone");
        String age= req.getParameter("age");
        String gender= req.getParameter("gender");
        String salary= req.getParameter("salary");

        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName(name);
        employeeDto.setId(Integer.parseInt(id));
        employeeDto.setAge(Integer.parseInt(age));
        employeeDto.setPhone(Long.parseLong(phone));
        employeeDto.setEmail(email);
        employeeDto.setGender(Gender.valueOf(gender));
        employeeDto.setSalary(new BigDecimal(salary));

       boolean update= employeeService.updateEmployee(employeeDto);

        req.setAttribute("empUpdate",update);
        resp.sendRedirect("viewAllEmployees");

    }
}
