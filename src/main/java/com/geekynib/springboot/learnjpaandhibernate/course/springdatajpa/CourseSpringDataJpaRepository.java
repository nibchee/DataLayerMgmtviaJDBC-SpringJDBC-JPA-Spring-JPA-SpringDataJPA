package com.geekynib.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.geekynib.springboot.learnjpaandhibernate.course.Course;


public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long>{

	//Defining Custom Queries
 List<Course> findByAuthor(String author);
}
