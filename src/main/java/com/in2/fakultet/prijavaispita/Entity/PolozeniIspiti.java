
package com.in2.fakultet.prijavaispita.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="POLOZENI_ISPITI")
public class PolozeniIspiti{
    
    @Id
    @Column
    @NotNull
    @GeneratedValue
    private int id;
    
    @ManyToOne
    @JsonManagedReference
    @JsonIgnore
    @JoinColumn(name = "studentId")
    @NotNull
    private Student studentId;
    
    @ManyToOne
    @JsonManagedReference
    @JsonIgnore
    @JoinColumn(name = "predmetId")
    @NotNull
    private Predmet predmetId;
    
    @Column
    private Date creationDate;
    
    @Column
    private int createdBy;
    
    @Column
    private Date lastUpdatedDate;
    
    @Column
    private int lastUpdatedBy;
    
    @Column
    @NotNull
    private String rowStatus;
    
    @Column
    @NotNull
    @Min(value = 5,message = "Minimalna ocena je 5")
    @Max(value = 10,message = "Maksimalna ocena je 10")
    private int grade;
    
    @Column
    @NotNull
    private Date datumPolaganja;
    
    

    public PolozeniIspiti() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    public Predmet getPredmetId() {
        return predmetId;
    }

    public void setPredmetId(Predmet predmetId) {
        this.predmetId = predmetId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public int getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(int lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(String rowStatus) {
        this.rowStatus = rowStatus;
    }
    
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public Date getDatumPolaganja() {
        return datumPolaganja;
    }

    public void setDatumPolaganja(Date datumPolaganja) {
        this.datumPolaganja = datumPolaganja;
    }

    @PrePersist
    public void prePersist() {
       Date now = new java.sql.Date(new java.util.Date().getTime());
        this.creationDate = now;
        this.lastUpdatedDate = now;
        this.createdBy = 1;
        this.lastUpdatedBy = 1;
    }
}
