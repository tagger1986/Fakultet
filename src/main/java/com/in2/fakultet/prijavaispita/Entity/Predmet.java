
package com.in2.fakultet.prijavaispita.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nosto
 */

    
@Entity    
@Table(name="PREDMET")
//@OrderBy("lastname ASC")
public class Predmet {
    
    @Id
    @Column
    @NotNull
    private int predmetId;
    @Column
    @NotNull
//    @OneToMany
    private String predmet;

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

    @Override
    public String toString() {
        return "Predmet{" + "predmetId=" + predmetId + ", predmet=" + predmet + '}';
    }

}
