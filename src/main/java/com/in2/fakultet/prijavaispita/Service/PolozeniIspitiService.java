package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import java.util.List;

public interface PolozeniIspitiService  {
    
     public List<PolozeniIspiti> findAllPolozeniIspiti();
     public PolozeniIspiti findById(int id);
     public PolozeniIspiti save(PolozeniIspiti ispit);
     public void delete(int id);
     
     
     public List<PolozeniIspiti> findAllByStudentId(int studentId);
     public String calculateAvg(int studentId);


}
