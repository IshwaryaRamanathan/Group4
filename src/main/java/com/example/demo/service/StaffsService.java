package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Staffs;

@Service
public interface StaffsService {
	List<Staffs> getAllStaffs();
}
