package com.geekynib.springboot.learnjpaandhibernate.course.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.geekynib.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner{

	@Autowired
	CourseJpaRepository courseJpaRepository;
	
	@Override
	public void run(String... args) throws Exception {
	   courseJpaRepository.insert(new Course(4,"Nirbhay Wonderful Mind","Nirbhay"));
	   	}

	
}
