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

@WebServlet(urlPatterns = "/updateWarehouse")
public class UpdateWarehouseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        WarehouseService warehouseService = new WarehouseServiceImpl();
        WarehouseDto warehouseDto = new WarehouseDto();
        warehouseDto.setStationId(req.getParameter("stationId"));
        warehouseDto.setId(Integer.parseInt(req.getParameter("id")));
        warehouseDto.setEmail(req.getParameter("email"));
        warehouseDto.setVaultCapacity(Double.parseDouble(req.getParameter("vaultCapacity")));
        warehouseDto.setRegionCode(req.getParameter("regionCode"));

        warehouseService.updateWarehouse(warehouseDto);
        resp.sendRedirect("viewAllWarehouse");
    }
}
