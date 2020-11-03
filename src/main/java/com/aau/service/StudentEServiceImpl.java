package com.aau.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.aau.entity.StudentEntity;
import com.aau.model.dto.StudentDto;
import com.aau.repository.StudentRepository;
@Service
public class StudentEServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;


	public StudentDto createStudentDetails(StudentDto dto) {
		
		dto.setUserId(UUID.randomUUID().toString());
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		StudentEntity studentEntity = mapper.map(dto, StudentEntity.class);
		
		studentRepository.save(studentEntity);
		
		StudentDto studentDataTransfer = mapper.map(studentEntity, StudentDto.class); 
		
		return studentDataTransfer;
	}

	@Override
	public StudentEntity getStudentDetails(long studentId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
