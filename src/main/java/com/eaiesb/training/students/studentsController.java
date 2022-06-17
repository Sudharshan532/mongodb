package com.eaiesb.training.students;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class studentsController {
 
	@Autowired
	private studentsRepository stuRepo;
	
	@GetMapping("/students")
	public List <students> getAllstudents()
	{
		return stuRepo.findAll();
	}
	
	public students saveStudent(@Validated @RequestBody students student)
	{
		return stuRepo.save(student);
	}
}
