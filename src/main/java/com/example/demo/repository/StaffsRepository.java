package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Staffs;

@Repository
public interface StaffsRepository extends JpaRepository<Staffs, Integer>{

}
