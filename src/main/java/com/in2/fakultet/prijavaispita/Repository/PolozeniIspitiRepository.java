
package com.in2.fakultet.prijavaispita.Repository;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolozeniIspitiRepository extends CrudRepository<PolozeniIspiti, Serializable>,JpaRepository<PolozeniIspiti, Serializable>{
    
            public List<PolozeniIspiti> findAllByStudentId(int id);

}
