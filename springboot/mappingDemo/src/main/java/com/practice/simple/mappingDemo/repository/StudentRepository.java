package com.practice.simple.mappingDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.simple.mappingDemo.entity.StudentEntity;

import jakarta.transaction.Transactional;


@Transactional
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
