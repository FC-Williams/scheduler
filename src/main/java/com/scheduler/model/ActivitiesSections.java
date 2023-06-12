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
@Table(name = "ACTIVITIES_SECTIONS", schema = "SCHEDULE")
public class ActivitiesSections {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activitySectionId;

    private Long activityId;

    private String section;

    private String description;

    private Date startDate;

    private Date endDate;

    private Time startHour;

    private Time endHour;

    private String username;
    
    @Column(name = "CREATION_DATE", nullable = false, updatable = false)
    @CreationTimestamp
    private Date creationDate;

    // @Column(name = "LAST_UPDATE")
    private Date lastUpdate;

    public Status(){}

    public Status(Long activitySectionId, Long activityId, String section, String description, Date startDate, Date endDate, Time endHour, Time startHour, String username, Date creationDate, Date lastUpdate) {
        this.activitySectionId = activitySectionId;
        this.activityId = activityId;
        this.section = section;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startHour = startHour;
        this.endHour = endHour;
        this.username = username;
        this.creationDate = creationDate;
        this.lastUpdate = lastUpdate;
    }


    public Long getActivitiesSectionId(){
        return this.activitySectionId;
    }

    public void setActivitiesSectionId(Long activitySectionId){
        this.activitySectionId = activitySectionId;
    }

    public Long getActivityId(){
        return this.activityId;
    }

    public void setActivityId(Long activityId){
        this.activityId = activityId;
    }

    public String getSection(){
        return this.section;
    }

    public void setSection(String section){
        this.section = section;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Time getStartHour(){
        return this.startHour;
    }

    public void setStartHour(Time startHour){
        this.startHour = startHour;
    }

    public Time getEndHour(){
        return this.endHour;
    }

    public void setEndHour(Time endHour){
        this.endHour = endHour;
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
