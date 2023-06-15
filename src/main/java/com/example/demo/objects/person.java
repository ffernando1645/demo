package com.example.demo.objects;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.repository.StudentRepository;

import lombok.NoArgsConstructor;

/*
 * @Component is an annotation that allows Spring to detect our custom beans automatically. 
 * */
@Component
@NoArgsConstructor
public class person {
	
	String name;
	int age;
	int ci;
	String address;
	
	@Autowired
	private StudentRepository repository;
}
