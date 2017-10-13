package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nosto
 */
public interface PolozeniIspitiService  {
    
     public List<PolozeniIspiti> getAllPolozeniIspiti();
     public List<PolozeniIspiti> getAllByStudent(int id);
     public PolozeniIspiti findById(int id);
     public PolozeniIspiti save(PolozeniIspiti ispit);
     public void delete(int id);


}
