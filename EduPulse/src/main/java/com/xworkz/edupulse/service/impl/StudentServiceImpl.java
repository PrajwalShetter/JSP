package com.xworkz.edupulse.service.impl;

import com.xworkz.edupulse.dao.StudentDao;
import com.xworkz.edupulse.dao.impl.StudentDaoImpl;
import com.xworkz.edupulse.dto.StudentDto;
import com.xworkz.edupulse.entity.StudentEntity;
import com.xworkz.edupulse.service.StudentService;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoImpl();
    @Override
    public boolean saveStudent(StudentDto student) {
        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setStudentName(student.getStudentName());
        studentEntity.setEmail(student.getEmail());
        studentEntity.setSemester(student.getSemester());
        studentEntity.setPassword(student.getPassword());
        studentEntity.setConPassword(student.getConPassword());
        studentEntity.setRollNumber(student.getRollNumber());

        studentDao.saveStudent(studentEntity);

        return true;
    }

    @Override
    public StudentDto getStudent(int id) {

        StudentDto studentDto = new StudentDto();
        StudentEntity studentEntity = studentDao.getStudent(id);
        if(studentEntity!= null){
            studentDto.setConPassword(studentEntity.getConPassword());
            studentDto.setId(studentEntity.getId());
            studentDto.setEmail(studentEntity.getEmail());
            studentDto.setSemester(studentEntity.getSemester());
            studentDto.setStudentName(studentEntity.getStudentName());
            studentDto.setPassword(studentEntity.getPassword());
            studentDto.setRollNumber(studentEntity.getRollNumber());

        }
        return studentDto;

    }
}
