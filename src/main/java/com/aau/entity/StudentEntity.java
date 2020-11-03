package com.aau.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@Entity
public class StudentEntity {
	
	@Id
	private long studentId;
	@Column(name="s_name")
	private String s_name;
	private String course;
	
	
	
	

}
