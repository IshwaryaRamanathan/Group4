package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Students;

@Service
public interface StudentsService {
	List<Students> getAllStudents();
}