package com.xworkz.yieldmap.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WarehouseDto {

    private int id;
    private String stationId;
    private String email;
    private double vaultCapacity;
    private String regionCode;
    private String password;
    private String confirmPassword;
}
