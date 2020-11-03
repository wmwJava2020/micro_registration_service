package com.aau.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentRequestModel {
	
	
	private long studentId;
	private String s_name;
	private String course;

}
