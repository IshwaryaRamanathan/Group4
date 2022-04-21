package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Subjects;

@Repository
public interface SubjectsRepository extends JpaRepository<Subjects, Integer>{

}
