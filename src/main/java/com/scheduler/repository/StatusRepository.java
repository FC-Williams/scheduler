package com.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scheduler.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long>{
    
}
