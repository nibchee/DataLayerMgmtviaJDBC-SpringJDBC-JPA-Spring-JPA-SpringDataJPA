 package com.geekynib.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.geekynib.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {
   @Autowired
	private JdbcTemplate springJdbcTemplate;
     
    private static String INSERT_QUERY="""
    		insert into COURSE (id,name,author) values(?,?,?);
    		""";
    
    private static String DELETE_QUERY="""
    		delete from  COURSE where id=?;
    		""";
    
    private static String SELECT_QUERY="""
    		select *  from  COURSE where id=?;
    		""";
    
    public void insert(Course course) {
    	springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }
    
    public void delete(long id) {
    	springJdbcTemplate.update(DELETE_QUERY,id);
    }
    
    public Course findById(long id) {
    	//Returns ResultSet-> Bean change it to bean=>Row MApper i.e BeanPropertyRowMapper class
    	//id
    	
    	return springJdbcTemplate.queryForObject(SELECT_QUERY,
    			new BeanPropertyRowMapper<>(Course.class),id);
    	
    }
    
}
