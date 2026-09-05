package com.xworkz.yieldmap.servlet;

import com.xworkz.yieldmap.dto.WarehouseDto;
import com.xworkz.yieldmap.service.WarehouseService;
import com.xworkz.yieldmap.service.impl.WarehouseServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/edit")
public class GetWarehouseServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        WarehouseService warehouseService = new WarehouseServiceImpl();
        String id = req.getParameter("id");
        WarehouseDto warehouseDto = warehouseService.getWarehouse(Integer.parseInt(id));

        req.setAttribute("dto", warehouseDto);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateWarehouse.jsp");
        requestDispatcher.forward(req,resp);
    }
}
