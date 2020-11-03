package com.aau.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDto {
	
	private long studentId;
	private String userId;
	private String s_name;
	private String course;

}
