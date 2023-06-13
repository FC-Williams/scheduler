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
@Table(name = "EMPLOYES_ACTIVITIES", schema = "SCHEDULE")
public class EmployesActivities {
    @Id
    private Long employId;

    @Id
    private Long activityId;

    public void Status() {
    }

    public void Status(Long employId, Long activityId) {
        this.employId = employId;
        this.activityId = activityId;
    }

    public Long getEmployId() {
        return this.employId;
    }

    public void setEmployId(Long employId) {
        this.employId = employId;
    }

    public Long getActivityId() {
        return this.activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
