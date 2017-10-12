package com.in2.fakultet.prijavaispita.Repository;

import com.in2.fakultet.prijavaispita.Entity.Student;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
  
}