package com.harsha.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.harsha.studentcrud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}