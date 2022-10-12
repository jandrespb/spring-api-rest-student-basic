package com.example.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> alumno;

	// define @PostConstruct to load the student data ... only once!
	@PostConstruct
	public void loadData() {

		alumno = new ArrayList<>();

		alumno.add(new Student("Benito", "Juarez"));
		alumno.add(new Student("Carla", "Ramirez"));
		alumno.add(new Student("Ronda", "Rousi"));
	}

	// define endpoint for "/students" - return list of student

	@GetMapping("/students")
	public List<Student> getStudents() {

		return alumno;
	}
	
	// define endpoint for "/students/{studentId}" - return student at index
	@GetMapping("students/{studentId}")
	public Student getStudent (@PathVariable int studentId) {
		
		// just index into the list ... keep it simple for now
		
		// check the student against list size
		if((studentId >= alumno.size()) || (studentId < 0)) {
			
			throw new StudentNotFoundException("Student id not found -> " + studentId);
		}
		
		return alumno.get(studentId);
	}
	
	
}
