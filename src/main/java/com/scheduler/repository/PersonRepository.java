package com.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scheduler.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
