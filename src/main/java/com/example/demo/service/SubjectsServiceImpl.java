package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Subjects;
import com.example.demo.repository.SubjectsRepository;

@Service
public class SubjectsServiceImpl implements SubjectsService{

	@Autowired
	SubjectsRepository subjectrepository;
	
	@Override
	public List<Subjects> getAllSubjects() {
		return subjectrepository.findAll();
	}

}
