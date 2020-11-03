package com.aau.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentResponseModel {
	
	//@@ USED AS A RESPONSE MODEL TO END USERS
	private long studentId;
	private String s_name;
	private String course;


}
