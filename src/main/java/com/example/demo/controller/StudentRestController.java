package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTOs.StudentDTO;
import com.example.demo.service.StudentService;
import com.example.demo.utils.MapperUtil;

@RestController
@RequestMapping("/students")
public class StudentRestController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/all")
	public List<StudentDTO> getAllStudents(){
		return MapperUtil.getStudentDTOFromStudentList(service.findAll());
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveStudent(@RequestBody StudentDTO student){
		
		return new ResponseEntity<>(service.saveOrUpdateStudent(MapperUtil.getStudentFromStudentDTO(student)), HttpStatus.OK);
	}
}
