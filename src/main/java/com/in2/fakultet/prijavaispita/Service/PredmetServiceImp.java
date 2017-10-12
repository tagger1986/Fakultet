/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.Predmet;
import com.in2.fakultet.prijavaispita.Repository.PredmetRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nosto
 */
@Service
public class PredmetServiceImp implements PredmetService{

    private PredmetRepository predmetRepository;
    
    @Autowired
    public PredmetServiceImp(PredmetRepository predmetRepository) {
        this.predmetRepository = predmetRepository;
    }
    
    

    @Override
    public List<Predmet> getAllPredmeti() {
        List<Predmet> ispiti = new ArrayList <>();
        predmetRepository.findAll().forEach(ispiti::add);
        return ispiti;
    }

    @Override
    public Predmet findById(int id) {
        return predmetRepository.findOne(id);
    }

    @Override
    public Predmet save(Predmet predmet) {
        return predmetRepository.save(predmet);
      
    }

    @Override
    public void delete(int id) {
        predmetRepository.delete(id);
    }
    
}
