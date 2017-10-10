
package com.in2.fakultet.prijavaispita.Entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="STUDENT")
public class Student {
    
    @Id
    @Column
    @NotNull
    @OrderBy
    private int studentId;
    // da li treba nesto da se radi sa PK posebno?
    @Column
    @NotNull
    private int code;
    @Column
    @NotNull
    private String name;
    @Column
    @NotNull
    private String surname;
    @Column
    @NotNull
    private String description;
    @Column
    @NotNull
    private Date creationDate;
    @Column
    @NotNull
    private int createdBy;
    @Column
    @NotNull
    private int lastUpdatedBy;
    @Column
    @NotNull
    private Date lastUpdatedDate;
    @Column
    @NotNull
    private String rowStatus;
    

    public int getId() {
        return studentId;
    }

    public void setId(int id) {
        this.studentId = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(int lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(String rowStatus) {
        this.rowStatus = rowStatus;
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
        return "Student{" + "id=" + studentId + ", code=" + code + ", name=" + name
                + ", surname=" + surname + ", description=" + description + ", creationDate=" + creationDate 
                + ", createdBy=" + createdBy + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate 
                + ", rowStatus=" + rowStatus + '}';
    }
    
    
    
    
    
}
