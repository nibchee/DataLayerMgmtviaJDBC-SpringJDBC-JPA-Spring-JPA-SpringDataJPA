package com.geekynib.springboot.learnjpaandhibernate.course.jpa;


import org.springframework.stereotype.Repository;

import com.geekynib.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

//as here talking with Database so use @Repository
@Repository
@Transactional
public class CourseJpaRepository {
    
	//Autowiring the beans or we can use @PersistenceContext 
	@PersistenceContext
	EntityManager entityManager;
    
    public void insert(Course course) {
    	entityManager.merge(course);
    }
    
    
    public Course findById(long id) {
    	return entityManager.find(Course.class,id);
    }
    
    public void deleteById(long id) {
        Course course=entityManager.find(Course.class,id);
    	entityManager.remove(course);
    }
}
