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
@Table(name = "ACTIVITIES_TYPES", schema = "SCHEDULE")
public class ActivitiesType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activityTypeId;

    private Long statusId;

    private String activityType;

    private String description;

    private String username;

    @Column(name = "CREATION_DATE", nullable = false, updatable = false)
    @CreationTimestamp
    private Date creationDate;

    // @Column(name = "LAST_UPDATE")
    private Date lastUpdate;

    public void Status() {
    }

    public void Status(Long activityTypeId, Long statusId, String activityType, String description, String username,
            Date creationDate, Date lastUpdate) {
        this.activityTypeId = activityTypeId;
        this.statusId = statusId;
        this.activityType = activityType;
        this.description = description;
        this.username = username;
        this.creationDate = creationDate;
        this.lastUpdate = lastUpdate;
    }

    public Long getActivityTypeId() {
        return this.activityTypeId;
    }

    public void setActivityTypeId(Long activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public Long getStatusId() {
        return this.statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getActivityType() {
        return this.activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
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
