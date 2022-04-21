package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Students;
import com.example.demo.repository.StudentsRepository;

@Service
public class StudentsServiceImpl implements StudentsService
{

	@Autowired
	StudentsRepository studentrepository;
	
	@Override
	public List<Students> getAllStudents() {
		return studentrepository.findAll();
	}

}
