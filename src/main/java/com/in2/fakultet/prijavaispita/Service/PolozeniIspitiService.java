package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import java.util.List;

public interface PolozeniIspitiService  {
    
     public List<PolozeniIspiti> getAllPolozeniIspiti();
     public List<PolozeniIspiti> getAllByStudent(int id);
     public PolozeniIspiti findById(int id);
     public PolozeniIspiti save(PolozeniIspiti ispit);
     public void delete(int id);
     
     
     public List<PolozeniIspiti> findAllBySid(PolozeniIspiti polozeniIspiti);


}
