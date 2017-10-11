/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in2.fakultet.prijavaispita.Repository;

import com.in2.fakultet.prijavaispita.Entity.Predmet;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nosto
 */
@Repository
public interface PredmetRepository extends CrudRepository<Predmet, Integer> {
    
}
