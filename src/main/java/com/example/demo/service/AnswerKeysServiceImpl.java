package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnswerKeys;
import com.example.demo.repository.AnswerKeysRepository;

@Service
public class AnswerKeysServiceImpl implements AnswerKeysService {

	@Autowired
	AnswerKeysRepository keyrepository;
	
	@Override
	public List<AnswerKeys> getAllAnswerKeys() {
		return keyrepository.findAll();
	}

	@Override
	public List<AnswerKeys> getAnswerKeyBySubjectid(int subjectid) {
		return keyrepository.getAnswerKeyBySubjectid(subjectid);
	}

}
