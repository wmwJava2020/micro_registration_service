package com.aau.service;

import com.aau.entity.StudentEntity;
import com.aau.model.dto.StudentDto;

public interface StudentService {
	
	StudentDto createStudentDetails(StudentDto studentDto);
	StudentEntity getStudentDetails(long studentId);

}
