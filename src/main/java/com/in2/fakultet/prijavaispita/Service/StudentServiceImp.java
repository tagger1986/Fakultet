
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.Student;
import com.in2.fakultet.prijavaispita.Repository.StudentRepository;
import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



@Service
public class StudentServiceImp implements StudentService{
    
    private StudentRepository studentRepository;
    
    @Autowired
    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    

    @Override
    public List<Student> getAllStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student save(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    



    
    
    
    
    
    
    
}
