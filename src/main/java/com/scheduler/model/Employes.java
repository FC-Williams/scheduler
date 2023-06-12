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
@Table(name = "EMPLOYES", schema = "SCHEDULE")
public class Employes {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employId;

    private Long statusId;

    private String curp;

    private String rfc;

    private String street;

    private String colony;

    private Long zip;

    private String institutionalMail;

    private Date startDate;

    private Date endDate;

    private Sring username;
    
    @Column(name = "CREATION_DATE", nullable = false, updatable = false)
    @CreationTimestamp
    private Date creationDate;

    // @Column(name = "LAST_UPDATE")
    private Date lastUpdate;

    public Status(){}

    public Status(Long employId, Long statusId, String curp, String rfc, String street, String colony, Long zip, String institutionalMail, String username, Date startDate, Date endDate, Date creationDate, Date lastUpdate) {
        this.employId = employId;
        this.statusId = statusId;
        this.curp = curp;
        this.rfc = rfc;
        this.street = street;
        this.colony = colony;
        this.zip = zip;
        this.institutionalMail = institutionalMail;
        this.startDate = startDate;
        this.endDate = endDate;
        this.username = username;
        this.creationDate = creationDate;
        this.lastUpdate = lastUpdate;
    }


    public Long getEmployId(){
        return this.employId;
    }

    public void setEmployId(Long employId){
        this.employId = employId;
    }

    public Long getStatusId(){
        return this.statusId;
    }

    public void setStatusId(Long statusId){
        this.statusId = statusId;
    }

    public String getCurp(){
        return this.curp;
    }

    public void setCurp(String curp){
        this.curp = curp;
    }

    public String getRfc(){
        return this.rfc;
    }

    public void setRfc(String rfc){
        this.rfc = rfc;
    }

    public String getStreet(){
        return this.street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getColony(){
        return this.colony;
    }

    public void setColony(String colony){
        this.colony = colony;
    }

    public Long  getZip(){
        return this.zip;
    }

    public void setZip(Long zip){
        this.zip = zip;
    }

    public String getInstitutionalMail(){
        return this.institutionalMail;
    }

    public void setInstitutionalMail(String institutionalMail){
        this.institutionalMail = institutionalMail;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
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
