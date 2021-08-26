package com.kyanja.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kyanja.dao.Student_DAO;
import com.kyanja.model.Student;
import com.kyanja.service.Student_Service;

@Service
@Transactional
public class Student_Service_Imp implements Student_Service {

	@Autowired
	private Student_DAO studentdao;

	public boolean saveStudent(Student student) {
		return studentdao.saveStudent(student);
	}

	public List<Student> getStudents() {
		return studentdao.getStudents();
	}

	public boolean deleteStudent(Student student) {
		return studentdao.deleteStudent(student);
	}

	public List<Student> getStudentByID(Student student) {
		return studentdao.getStudentByID(student);
	}

	public boolean updateStudent(Student student) {
		return studentdao.updateStudent(student);
	}

}