package com.student.demorestapi.service;

import java.util.Optional;

import com.student.demorestapi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demorestapi.repository.StudentRepository;

@Service("v1")
public class StudentServiceV1Impl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Iterable<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> findByID(String id) {
		return studentRepository.findById(id);
	}

	@Override
	public void removeStudent(String id) {
    	Student st = new Student();
    	st.setId(id);
    	studentRepository.delete(st);
	}

}
