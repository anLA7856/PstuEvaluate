package com.ld.service;

import java.util.List;

import com.ld.model.Student;

public interface StudentService {
   List<Student> getAllStudent();
   //评分
   void updateGrade(int id, float grade);
   
}
