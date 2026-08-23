package com.xworkz.edupulse.dao;

import com.xworkz.edupulse.entity.StudentEntity;

public interface StudentDao {

    boolean saveStudent(StudentEntity student);
    StudentEntity getStudent(int id);
}
