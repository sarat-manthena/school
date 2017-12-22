package com.google.school.controllers;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.school.model.Student;
import com.google.school.service.StudentService;

@RestController
@RequestMapping("/school")
public class SchoolController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(method=RequestMethod.GET, value="/healthcheck")
    public String index() {
        return "Welcome to Reddy Public School...";
    }
	
	@RequestMapping(method=RequestMethod.PUT, 
			value="/student",
			produces="application/json",
			consumes="application/json")
	public @ResponseBody int addStudent(@RequestBody Student s) {
		int rollNo;
		rollNo = studentService.addStudent(s);
		return rollNo;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, 
			value="/student/{rollNo}",
			produces="application/json")
	public @ResponseBody String deleteStudent(@PathVariable int rollNo) {
		String response = studentService.deleteStudent(rollNo);
		return response;
	}
	
	@RequestMapping(method=RequestMethod.GET, 
			value="/student",
			produces="application/json")
	public @ResponseBody ArrayList<Student> getAllStudents() {
		return studentService.getStudentArray();
	}
	
	@RequestMapping(method=RequestMethod.GET, 
			value="/student/{rollNo}",
			produces="application/json")
	public @ResponseBody Student getStudent(@PathVariable int rollNo) {
		return studentService.getStudent(rollNo);
	}
}
