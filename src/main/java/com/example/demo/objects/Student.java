package com.example.demo.objects;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * The annotations @Document applied to a class marks this class as a candidate for mapping to the database. T
 * */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "students")
public class Student {

	@Id
	private String id;
	private String name;
	private long studentNumber;
	private String email;
	private List<String> courseList;
	private float gpa;
	
	@Override
	public String toString() {
		
		return "Student{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", studentNumber=" + studentNumber +
				", email='" + email + '\'' +
				", courseList=" + courseList +
				", gpa=" + gpa +
				'}';
	}
}
