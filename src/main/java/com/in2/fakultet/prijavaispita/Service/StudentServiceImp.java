package com.in2.fakultet.prijavaispita.Service;

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
    @Autowired
    private PredmetService predmetService;
    

    @Override
    public List<Student> getAllStudents() {
        List<Student> studenti = new ArrayList<>();
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

    @Override
    public List<Student> findAllByLastUpdatedBy(int id) {
      return  studentRepository.findAllByLastUpdatedBy(id);
    }
    
      @Override
    public List<Student> findAllByStudentId(int id) {
        return studentRepository.findAllByStudentId(id);
    }


}  