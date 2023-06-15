package com.example.demo.utils;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.DTOs.StudentDTO;
import com.example.demo.objects.Student;

public class MapperUtil {

	public static StudentDTO getStudenDTO(Student student){
		
		return new StudentDTO(student.getId(), student.getName(), student.getStudentNumber(), 
				              student.getEmail(), student.getCourseList(), student.getGpa());
	}
	
	public static List<StudentDTO> getStudentDTOFromStudentList(List<Student> studentList){
		
		List<StudentDTO> resultList = new ArrayList<>();
		
		studentList.stream().forEach(item -> resultList.add(getStudenDTO(item)));
		
		return resultList;
	}
	
	public static Student getStudentFromStudentDTO(StudentDTO studentDto) {
		return new Student(studentDto.getId(), studentDto.getName(), studentDto.getStudentNumber(), 
	                       studentDto.getEmail(), studentDto.getCourseList(), studentDto.getGpa());
	}
}
