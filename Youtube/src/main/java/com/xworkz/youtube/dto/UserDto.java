package com.xworkz.youtube.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {

    private String handle;
    private  String channelName;
    private  String email;
    private  String category;
    private String password;
    private String conPassword;

}
