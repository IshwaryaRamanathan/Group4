package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AnswerKeys;
import com.example.demo.model.AnswerSheets;
import com.example.demo.model.Questions;
import com.example.demo.model.Results;
import com.example.demo.model.Staffs;
import com.example.demo.model.Students;
import com.example.demo.model.Subjects;
import com.example.demo.service.AnswerKeysService;
import com.example.demo.service.AnswerSheetsService;
import com.example.demo.service.QuestionsService;
import com.example.demo.service.ResultsService;
import com.example.demo.service.StaffsService;
import com.example.demo.service.StudentsService;
import com.example.demo.service.SubjectsService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AnswerKeysService keyservice;

	@Autowired
	AnswerSheetsService sheetservice;

	@Autowired
	QuestionsService questionservice;

	@Autowired
	ResultsService resultservice;

	@Autowired
	StaffsService staffservice;

	@Autowired
	StudentsService studentservice;

	@Autowired
	SubjectsService subjectservice;

	@GetMapping("/test")
	public String test() {
		return "Admin!!!!!";
	}

	@GetMapping("/showkeys")
	public List<AnswerKeys> getAllAnswerKeys() {
		return keyservice.getAllAnswerKeys();
	}

	@GetMapping("/showsheets")
	public List<AnswerSheets> getAllAnswerSheets() {
		return sheetservice.getAllAnswerSheets();
	}

	@GetMapping("/showquestions")
	public List<Questions> getAllQuestions() {
		return questionservice.getAllQuestions();
	}

	@GetMapping("/showresults")
	public List<Results> getAllResults() {
		return resultservice.getAllResults();
	}

	@GetMapping("/showstaffs")
	public List<Staffs> getAllStaffs() {
		return staffservice.getAllStaffs();
	}

	@GetMapping("/showstudents")
	public List<Students> getAllStudents() {
		return studentservice.getAllStudents();
	}

	@GetMapping("/showsubjects")
	public List<Subjects> getAllSubjects() {
		return subjectservice.getAllSubjects();
	}

	@RequestMapping("/calculateresult/studentidandsubjectid")
	public int calculateResult(@RequestParam int studentid, @RequestParam int subjectid) {
		return resultservice.calculateResult(studentid, subjectid);
	}

}
