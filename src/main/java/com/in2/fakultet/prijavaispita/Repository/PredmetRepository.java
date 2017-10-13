
package com.in2.fakultet.prijavaispita.Repository;

import com.in2.fakultet.prijavaispita.Entity.Predmet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredmetRepository extends CrudRepository<Predmet, Integer> {
    
}
