
package com.in2.fakultet.prijavaispita.Repository;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolozeniIspitiRepository extends CrudRepository<PolozeniIspiti, Serializable>{


  
}
