package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.objects.Student;

public interface StudentRepository extends MongoRepository<Student, String>{
	
	Student findByStudentNumber(long studentNumber);
	Student findByEmail(String email);
	List<Student> findAllByOrderByGpaDesc();
}
