package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Questions;
import com.example.demo.repository.QuestionsRepository;

@Service
public class QuestionsServiceImpl implements QuestionsService{

	@Autowired
	QuestionsRepository questionrepository;
	
	@Override
	public List<Questions> getAllQuestions() {
		return questionrepository.findAll();
	}

}
