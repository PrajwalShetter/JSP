package com.xworkz.datawave.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "datawave_pipelines")
public class UserEntity {

    @Id
    @Column(name = "pipeline_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pipelineId;

    @Column(name = "stream_name")
    private String streamName;

    @Column(name = "email")
    private String email;

    @Column(name = "data_schema")
    private String dataSchema;

    @Column(name = "password")
    private String password;

    @Column(name = "confirm_password")
    private String confirmPassword;
}
