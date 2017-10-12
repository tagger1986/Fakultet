
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.Student;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nosto
 */
public interface StudentService {
    
     public List<Student> getAllStudents();
     public List<Student> getStudentById(int id);
     public Student findById(int id);
     public Student save(Student student);
     public void delete(int id);
         
//getAllStudents, findById, save, delete
}

