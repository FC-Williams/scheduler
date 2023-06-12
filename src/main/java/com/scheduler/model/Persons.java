package com.scheduler.model;

import java.util.*;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;


@Entity
@Table(name = "PERSONS", schema = "SCHEDULE")
public class Persons {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;

    private Long statusId;

    private String name;

    private String lastName;

    private String mLastName;

    private String username;

    private Date birthdate;

    private String gender;

    private String mail;

    private String phoneNumber;
    
    @Column(name = "CREATION_DATE", nullable = false, updatable = false)
    @CreationTimestamp
    private Date creationDate;

    // @Column(name = "LAST_UPDATE")
    private Date lastUpdate;

    public Status(){}

    public Status(Long personId, Long statusId, String name, String lastName, String mLastName, String username, Date birthdate, String gender, String mail, String phoneNumber, Date creationDate, Date lastUpdate) {
        this.personId = personId;
        this.statusId = statusId;
        this.name = name;
        this.lastName = lastName;
        this.mLastName = mLastName;
        this.username = username;
        this.birthdate = birthdate;
        this.gender = gender;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.creationDate = creationDate;
        this.lastUpdate = lastUpdate;
    }


    public Long getPersonId() {
        return this.personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getStatusId() {
        return this.statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMLastName() {
        return this.mLastName;
    }

    public void setMLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @PreUpdate
    public void setLastUpdate() {
        this.lastUpdate = new Date();
    }

}
