package com.geekynib.springboot.learnjpaandhibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.geekynib.springboot.learnjpaandhibernate.course.Course;


@Component
public class courseSpringDataJpaCommandlineRunner implements CommandLineRunner {
	
	@Autowired
	CourseSpringDataJpaRepository courseSpringDataJpaRepository;
	
	@Override
	public void run(String... args) throws Exception {
	   courseSpringDataJpaRepository.save(new Course(4,"Nirbhay Wonderful Mind","Nirbhay"));
	   courseSpringDataJpaRepository.findAll();    
	}

}
