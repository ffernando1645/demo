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


@RestController /* it is an annotation and it is applied to a class to mark it as a request handler. Spring RestController annotation is used to create RESTful web services using Spring MVC. */
@RequestMapping("/students") /*annotation used to map web requests onto specific handler classes 
                              and/or handler methods. @RequestMapping can be applied to the controller
                              class as well as methods*/
public class StudentRestController {
	
	@Autowired /* is used for automatic dependency injection.*/
	
	/*
	 * In software engineering, dependency injection is a programming technique in which an object or 
	 * function receives other objects or functions that it depends on. 
	 * Dependency injection aims to separate the concerns of constructing objects and using them,
	 * leading to loosely coupled programs.
	 * */
	
	private StudentService service;
	
	@GetMapping("/all") /*@GetMapping annotation maps HTTP GET requests onto specific handler methods*/
	public List<StudentDTO> getAllStudents(){
		return MapperUtil.getStudentDTOFromStudentList(service.findAll());
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveStudent(@RequestBody StudentDTO student){
		/*ResponseEntity represents the whole HTTP response: status code, headers, and body*/
		return new ResponseEntity<>(service.saveOrUpdateStudent(MapperUtil.getStudentFromStudentDTO(student)), HttpStatus.OK);
	}
}
