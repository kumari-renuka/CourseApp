package com.springrest.springrest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}
	
	
	@Override
	public Course getCourse(long courseId) {
		return courseDao.getOne(courseId);
	}
	
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Course updadeCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
		
		Course course = courseDao.getOne(parseLong);
		courseDao.delete(course);
	}

}