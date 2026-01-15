package com.noushad.student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.noushad.student_management.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
