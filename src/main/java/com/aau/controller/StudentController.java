package com.aau.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aau.entity.StudentEntity;
import com.aau.model.dto.StudentDto;
import com.aau.model.request.StudentRequestModel;
import com.aau.model.response.StudentResponseModel;
import com.aau.service.StudentService;

@RestController
@RequestMapping("/class")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value="/create/data")
	public ResponseEntity<StudentResponseModel> createStudentDetails(@RequestBody StudentRequestModel studentRequestModel){
		
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		StudentDto studentDto = mapper.map(studentRequestModel, StudentDto.class);
		
		StudentDto dto = studentService.createStudentDetails(studentDto);
		
		StudentResponseModel  responseModel = mapper.map(dto, StudentResponseModel.class);
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(responseModel);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/main/campus/{studentId}")
	public StudentEntity getStudentDetails(@PathVariable Long studentId) {
		
		StudentEntity details = studentService.getStudentDetails(studentId);
		
		return details;
		
	}

}
