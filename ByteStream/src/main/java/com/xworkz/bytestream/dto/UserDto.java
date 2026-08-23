package com.xworkz.bytestream.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {


    private int streamId;
    private  String channelName;
    private String email;
    private String nodeRegion;
    private String password;
    private String conPassword;
}
