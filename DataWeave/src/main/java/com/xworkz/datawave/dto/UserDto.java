package com.xworkz.datawave.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int pipelineId;
    private String streamName;
    private String email;
    private String dataSchema;
    private String password;
    private String confirmPassword;
}
