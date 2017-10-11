/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import java.util.Collection;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

/**
 *
 * @author nosto
 */
public interface PolozeniIspitiService {
    
     public Set<PolozeniIspiti> getAllPolozeniIspiti();
     public PolozeniIspiti findById(int id);
     public PolozeniIspiti save(PolozeniIspiti ispit);
     public void delete(int id);
}
