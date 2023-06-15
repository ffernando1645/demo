package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.objects.Student;
import com.example.demo.objects.person;
import com.example.demo.repository.StudentRepository;

/*
 * it is used to mark the class as a service provider.
 * */

@Service
public class StudentServiceImpl implements StudentService {

	/*
	 * is the feature of the spring boot framework, which was used to enable us to inject 
	 * the dependency object implicitly;
	 * */
	@Autowired
	private StudentRepository repository;
	
	@Autowired
	private person person;
	
	@Override
	public List<Student> findAll() {
		return repository.findAll();
	}

	@Override
	public Student findByStudentNumber(long studentNumber) {
		return repository.findByStudentNumber(studentNumber);
	}

	@Override
	public Student findByEmail(String email) {
		return repository.findByEmail(email);
	}

	@Override
	public List<Student> findAllByOrderByGpaDesc() {
		return repository.findAllByOrderByGpaDesc();
	}

	@Override
	public Student saveOrUpdateStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public void deleteStudentById(String id) {
		repository.deleteById(id);
	}

}
