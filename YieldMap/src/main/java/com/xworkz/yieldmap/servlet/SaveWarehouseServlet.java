package com.xworkz.yieldmap.servlet;

import com.xworkz.yieldmap.dto.WarehouseDto;
import com.xworkz.yieldmap.service.WarehouseService;
import com.xworkz.yieldmap.service.impl.WarehouseServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class SaveWarehouseServlet extends HttpServlet {

    public SaveWarehouseServlet(){
        System.out.println("HI object is created");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {

        System.out.println("Initializing servlet object");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("HI i am do post");
        WarehouseService warehouseService = new WarehouseServiceImpl();
        String stationId = req.getParameter("stationId");
        String email = req.getParameter("email");
        String vaultCapacity = req.getParameter("vaultCapacity");
        String regionCode = req.getParameter("regionCode");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        WarehouseDto warehouseDto = new WarehouseDto();
       warehouseDto.setVaultCapacity(Double.parseDouble(vaultCapacity));
       warehouseDto.setEmail(email);
        warehouseDto.setConfirmPassword(confirmPassword);
        warehouseDto.setPassword(password);
        warehouseDto.setStationId(stationId);
        warehouseDto.setRegionCode(regionCode);

        warehouseService.saveWarehouse(warehouseDto);

        resp.getWriter().println("Thanks for registration");

    }

    @Override
    public void destroy() {

        System.out.println("closing all costly resources");
    }
}
