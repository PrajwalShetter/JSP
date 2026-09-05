package com.xworkz.yieldmap.servlet;

import com.xworkz.yieldmap.service.WarehouseService;
import com.xworkz.yieldmap.service.impl.WarehouseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class DeleteWarehouseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        WarehouseService warehouseService = new WarehouseServiceImpl();
        warehouseService.deleteWarehouse(Integer.parseInt(req.getParameter("id")));
        resp.sendRedirect("viewAllWarehouse");

    }
}
