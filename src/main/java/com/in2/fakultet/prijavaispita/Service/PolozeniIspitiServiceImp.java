
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.in2.fakultet.prijavaispita.Repository.PolozeniIspitiRepository;
import com.in2.fakultet.prijavaispita.Repository.StudentRepository;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


@Service
public class PolozeniIspitiServiceImp implements PolozeniIspitiService{
    
    private PolozeniIspitiRepository prijavaIspitaRepository;
    
    @Autowired
    public PolozeniIspitiServiceImp(PolozeniIspitiRepository prijavaIspitaRepository) {
        this.prijavaIspitaRepository = prijavaIspitaRepository;
    }

    @Override
    public Set<PolozeniIspiti> getAllPolozeniIspiti() {
        Set<PolozeniIspiti> ispiti = new HashSet<>();
        prijavaIspitaRepository.findAll().forEach(ispiti::add);
        return ispiti;
    }
    
    @Override
    public PolozeniIspiti findById(int id) {
        return prijavaIspitaRepository.findOne(id);
    }

    @Override
    public PolozeniIspiti save(PolozeniIspiti ispit) {
        return prijavaIspitaRepository.save(ispit);
    }

    @Override
    public void delete(int id) {
        prijavaIspitaRepository.delete(id);
    }

} 


