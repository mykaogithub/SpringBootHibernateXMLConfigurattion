package com.kyanja.service;

import java.util.List;

import com.kyanja.model.Student;

public interface Student_Service {

	public boolean saveStudent(Student student);

	public List<Student> getStudents();

	public boolean deleteStudent(Student student);

	public List<Student> getStudentByID(Student student);

	public boolean updateStudent(Student student);

}
