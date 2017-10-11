/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in2.fakultet.prijavaispita.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="POLOZENI_ISPITI")
public class PolozeniIspiti {
    
    @Id
    @Column
    @NotNull
    @GeneratedValue
    private int id;
    
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "student_id")
    private Student sid;
    
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "predmet_id")
    private Predmet pid;
    
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
    private int grade;

    public PolozeniIspiti() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudentId() {
        return sid;
    }

    public void setStudentId(Student sid) {
        this.sid = sid;
    }

    public Predmet getPredmetId() {
        return pid;
    }

    public void setPredmetId(Predmet predmet) {
        this.pid = pid;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLasrUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLasrUpdatedDate(Date lasrUpdatedDate) {
        this.lastUpdatedDate = lasrUpdatedDate;
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

    
    @PrePersist
    public void prePersist() {
       Date now = new java.sql.Date(new java.util.Date().getTime());
        this.creationDate = now;
        this.lastUpdatedDate = now;
        this.createdBy = 1;
        this.lastUpdatedBy = 1;
    }

    @Override
    public String toString() {
        return "PolozeniIspiti{" + "id=" + id + ", studentId=" + sid 
                + ", predmetId=" + pid + ", creationDate=" + creationDate + ", createdBy=" 
                + createdBy + ", lastUpdatedDate=" + lastUpdatedDate + ", lastUpdatedBy=" 
                + lastUpdatedBy + ", rowStatus=" + rowStatus + ", grade=" + grade + '}';
    }
    
    
    
    
    
    


    

}
