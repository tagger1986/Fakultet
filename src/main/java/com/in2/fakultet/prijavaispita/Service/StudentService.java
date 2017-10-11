
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.Student;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nosto
 */
public interface StudentService {
    
     public Set<Student> getAllStudents();
     public Student findById(int id);
     public Student save(Student student);
     public void delete(int id);
         
//getAllStudents, findById, save, delete
}

