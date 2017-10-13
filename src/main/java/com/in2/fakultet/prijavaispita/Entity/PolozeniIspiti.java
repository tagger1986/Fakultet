
package com.in2.fakultet.prijavaispita.Entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="POLOZENI_ISPITI")
public class PolozeniIspiti{
    
    @Id
    @Column
    @NotNull
    @GeneratedValue
//    @OrderBy
    private int id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name = "studentId")
    private Student studentId;
    
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "predmetId")
    private Predmet predmetId;
    
    @Column
    @NotNull
    private Date creationDate;
    
    @Column
    @NotNull
    private int createdBy;
    
    @Column
    @NotNull
    private Date lastUpdatedDate;
    
    @Column
    @NotNull
    private int lastUpdatedBy;
    
    @Column
    @NotNull
    private String rowStatus;
    
    @Column
    @NotNull
//    @OrderBy()
    private int grade;
    
    @Column
    @NotNull
//    @OrderBy
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
