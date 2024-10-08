package com.github.takayoshi24.encryption_api.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {

    //Select * FROM student WHERE email=?
    @Query("Select s FROM Student s WHERE s.email=?1")
    Optional<Student> findStudentByEmail(String email);
}
