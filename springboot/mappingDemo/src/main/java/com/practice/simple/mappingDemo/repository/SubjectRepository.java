package com.practice.simple.mappingDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.simple.mappingDemo.entity.Subject;

import jakarta.transaction.Transactional;


@Transactional
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
