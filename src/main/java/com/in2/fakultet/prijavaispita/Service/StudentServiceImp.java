package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.Student;
import com.in2.fakultet.prijavaispita.Repository.StudentRepository;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImp implements StudentService{
    
    private StudentRepository studentRepository;
    
    @Autowired
    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    

    @Override
    public Set<Student> getAllStudents() {
        Set<Student> studenti = new HashSet<>();
        studentRepository.findAll().forEach(studenti::add);
        return studenti;
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findOne(id);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
      
    }

    @Override
    public void delete(int id) {
        studentRepository.delete(id);
    }
    
    

}  