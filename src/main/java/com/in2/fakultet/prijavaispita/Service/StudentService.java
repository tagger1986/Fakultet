
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import java.util.List;

/**
 *
 * @author nosto
 */
public interface StudentService {
    
     public List<PolozeniIspiti> getAllIspiti();
     public PolozeniIspiti findById(int id);
     public PolozeniIspiti save(PolozeniIspiti ispit);
     public void delete(int id);
         
//getAllStudents, findById, save, delete

    
}
