
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.Predmet;
import com.in2.fakultet.prijavaispita.Entity.Student;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nosto
 */
public interface PredmetService {
    
     public Collection<Predmet> getAllPredmeti();
     public Predmet findById(int id);
     public Predmet save(Predmet predmet);
     public void delete(int id);
         
//getAllStudents, findById, save, delete
}