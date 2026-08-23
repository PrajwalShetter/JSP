package com.xworkz.edupulse.service;

import com.xworkz.edupulse.dto.StudentDto;

public interface StudentService {

    boolean saveStudent(StudentDto student);
    StudentDto getStudent(int id);

}
