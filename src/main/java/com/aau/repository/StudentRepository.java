package com.aau.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aau.entity.StudentEntity;
@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {

}
