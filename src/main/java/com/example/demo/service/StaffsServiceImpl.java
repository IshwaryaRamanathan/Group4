package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Staffs;
import com.example.demo.repository.StaffsRepository;

@Service
public class StaffsServiceImpl implements StaffsService{

	@Autowired
	StaffsRepository staffrepository;
	@Override
	public List<Staffs> getAllStaffs() {
		return staffrepository.findAll();
	}

}
