package com.xworkz.yieldmap.servlet;

import com.xworkz.yieldmap.dto.WarehouseDto;
import com.xworkz.yieldmap.service.WarehouseService;
import com.xworkz.yieldmap.service.impl.WarehouseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/viewAllWarehouse")
public class GetAllWarehouseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        WarehouseService warehouseService = new WarehouseServiceImpl();
        List<WarehouseDto> warehouseDtos = warehouseService.getAllWarehouse();

        req.setAttribute("warehouse", warehouseDtos);
        req.getRequestDispatcher("viewAllWarehouse.jsp").forward(req,resp);
    }
}
