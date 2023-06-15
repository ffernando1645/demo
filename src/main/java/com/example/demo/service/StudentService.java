package com.example.demo.service;

import java.util.List;

import com.example.demo.objects.Student;

public interface StudentService{

	List<Student> findAll();
	Student findByStudentNumber(long studentNumber);
	Student findByEmail(String email);
	List<Student> findAllByOrderByGpaDesc();
	Student saveOrUpdateStudent(Student student);
	void deleteStudentById(String id);
}
