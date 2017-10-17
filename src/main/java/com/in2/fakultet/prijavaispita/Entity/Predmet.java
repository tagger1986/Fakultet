
package com.in2.fakultet.prijavaispita.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


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
    
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "predmetId",cascade = CascadeType.ALL)
    private List<PolozeniIspiti> ispiti = new ArrayList<>();

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

    public List<PolozeniIspiti> getIspiti() {
        return ispiti;
    }

    public void setIspiti(List<PolozeniIspiti> ispiti) {
        this.ispiti = ispiti;
    }
   
    public Predmet() {
    }

}
