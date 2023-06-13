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
@Table(name = "USERS", schema = "SCHEDULE")
public class Users {
    @Id
    private String username;

    private Long personId;

    private Long statusId;

    private String userPass;

    private String mail;

    private String su;

    @Column(name = "CREATION_DATE", nullable = false, updatable = false)
    @CreationTimestamp
    private Date creationDate;

    // @Column(name = "LAST_UPDATE")
    private Date lastUpdate;

    public void Status() {
    }

    public void Status(String username, Long personId, Long statusId, String userPass, String mail, String su,
            Date creationDate, Date lastUpdate) {
        this.username = username;
        this.personId = personId;
        this.statusId = statusId;
        this.userPass = userPass;
        this.mail = mail;
        this.su = su;
        this.creationDate = creationDate;
        this.lastUpdate = lastUpdate;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public void setStauts(Long statusId) {
        this.statusId = statusId;
    }

    public String getUserPass() {
        return this.userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSu() {
        return this.su;
    }

    public void setSu(String su) {
        this.su = su;
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