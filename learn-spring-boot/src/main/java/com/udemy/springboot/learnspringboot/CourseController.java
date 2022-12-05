package com.udemy.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//courses

//course details: id,name, author

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn Spring Boot", "Pranav"),
				new Course(2, "Learn Microservices", "Alisha"),			
				new Course(3, "Learn Hibernate", "Saxy"),
				new Course(4, "Learn Java", "Leesha")
				);
	}
	
}
