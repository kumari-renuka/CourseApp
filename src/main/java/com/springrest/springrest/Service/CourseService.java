package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updadeCourse(Course course);
	
	public void deleteCourse(long parseLong);
}