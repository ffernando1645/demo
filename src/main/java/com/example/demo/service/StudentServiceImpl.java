package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.objects.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;
	
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
