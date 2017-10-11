
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.in2.fakultet.prijavaispita.Repository.PolozeniIspitiRepository;
import java.util.Collection;


@Service
public class PolozeniIspitiServiceImp implements PolozeniIspitiService{
    
    private PolozeniIspitiRepository prijavaIspitaRepository;
    
    @Autowired
    public PolozeniIspitiServiceImp(PolozeniIspitiRepository prijavaIspitaRepository) {
        this.prijavaIspitaRepository = prijavaIspitaRepository;
    }

    @Override
    public Collection<PolozeniIspiti> getAllPolozeniIspiti() {
        Collection<PolozeniIspiti > ispiti = new ArrayList<>();
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


