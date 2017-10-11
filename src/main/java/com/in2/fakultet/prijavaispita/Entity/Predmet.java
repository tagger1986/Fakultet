
package com.in2.fakultet.prijavaispita.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nosto
 */

    
@Entity    
@Table(name="PREDMET")
public class Predmet {
    
    @Id
    @Column
    @GeneratedValue
    @NotNull
    private int predmetId;
    @Column
    @NotNull
    private String predmet;
    
    @JsonBackReference 
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pid")
    private Set<PolozeniIspiti> ispiti = new HashSet<>();

    public int getPredmetId() {
        return predmetId;
    }

    public void setPredmetId(int predmetId) {
        this.predmetId = predmetId;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public Set<PolozeniIspiti> getIspiti() {
        return ispiti;
    }

    public void setIspiti(Set<PolozeniIspiti> ispiti) {
        this.ispiti = ispiti;
    }

  

    public Predmet() {
    }
   
    



}
