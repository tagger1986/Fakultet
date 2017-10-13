
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.Student;
import java.util.List;


/**
 *
 * @author nosto
 */
public interface StudentService {
    
     public List<Student> getAllStudents();
     public Student findById(int id);
     public Student save(Student student);
     public void delete(int id);
     
    public List<Student> findAllByLastUpdatedBy(int id);
    public List<Student> findAllByStudentId(int id);
         
//getAllStudents, findById, save, delete
}

