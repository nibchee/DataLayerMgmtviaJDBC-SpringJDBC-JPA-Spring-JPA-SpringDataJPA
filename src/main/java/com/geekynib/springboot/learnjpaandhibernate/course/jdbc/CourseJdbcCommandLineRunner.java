package com.geekynib.springboot.learnjpaandhibernate.course.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;

import com.geekynib.springboot.learnjpaandhibernate.course.Course;

//@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
     
	@Autowired
	private CourseJdbcRepository repository; 
	
	@Override
	public void run(String... args) throws Exception {
	repository.insert(new Course(3,"Learn Azure","Nirbhay"));	
	repository.delete(2);
	System.out.println(repository.findById(3));
	}

}
