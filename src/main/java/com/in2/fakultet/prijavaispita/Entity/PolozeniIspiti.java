/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in2.fakultet.prijavaispita.Entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="POLOZENI_ISPITI")
public class PolozeniIspiti {
    
    @Id
    @Column
    @NotNull
    private int id;
    
    @Column
    @NotNull
    private int studentId;
    
    @Column
    @NotNull
    private int predmetId;
    
    @Column
    @NotNull
    private Date creationDate;
    
    @Column
    @NotNull
    private int createdBy;
    
    @Column
    @NotNull
    private Date lasrUpdatedDate;
    
    @Column
    @NotNull
    private int lastUpdatedBy;
    
    @Column
    @NotNull
    private String rowStatus;
    
    @Column
    @NotNull
    private int grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getPredmetId() {
        return predmetId;
    }

    public void setPredmetId(int predmetId) {
        this.predmetId = predmetId;
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
        return lasrUpdatedDate;
    }

    public void setLasrUpdatedDate(Date lasrUpdatedDate) {
        this.lasrUpdatedDate = lasrUpdatedDate;
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

    @Override
    public String toString() {
        return "PolozeniIspiti{" + "id=" + id + ", studentId=" + studentId 
                + ", predmetId=" + predmetId + ", creationDate=" + creationDate 
                + ", createdBy=" + createdBy + ", lasrUpdatedDate=" + lasrUpdatedDate 
                + ", lastUpdatedBy=" + lastUpdatedBy + ", rowStatus=" + rowStatus 
                + ", grade=" + grade + '}';
    }

    

}
