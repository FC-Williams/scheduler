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
@Table(name = "GUESTS", schema = "SCHEDULE")
public class Guests {
    @Id
    private Long personId;

    @Id
    private Long activityId;

    public Status(){}

    public Status(Long personId, Long activityId) {
        this.personId = personId;
        this.activityId = actEmployId
    }


    public Long getPersonId() {
        return this.personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getActivityId() {
        return this.activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
