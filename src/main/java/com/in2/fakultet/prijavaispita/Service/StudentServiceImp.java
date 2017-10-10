
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import com.in2.fakultet.prijavaispita.Repository.StudentRepository;
import java.util.ArrayList;
import java.util.List;
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
    public List<PolozeniIspiti> getAllIspiti() {
        List<PolozeniIspiti > ispiti = new ArrayList<>();
        studentRepository.findAll().forEach(ispiti::add);
        return ispiti;
    }

    @Override
    public PolozeniIspiti findById(int id) {
        return studentRepository.findOne(id);
    }

    @Override
    public PolozeniIspiti save(PolozeniIspiti ispit) {
        return studentRepository.save(ispit);
    }

    @Override
    public void delete(int id) {
        studentRepository.delete(id);
    }

} 


