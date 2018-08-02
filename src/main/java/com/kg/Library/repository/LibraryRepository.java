package com.kg.Library.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Student,Long> {

	// Object addStudent(Student student3);

	// Object updateStudent(Student student1);
    

}