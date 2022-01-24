package com.learn.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.jpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {


}
