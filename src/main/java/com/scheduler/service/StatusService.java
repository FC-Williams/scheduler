package com.scheduler.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scheduler.model.Status;
import com.scheduler.repository.StatusRepository;

@Service
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;
    
    public List<Status> findAll(){
        return statusRepository.findAll();
    }

    public Optional<Status> findById(Long statusId){
        return statusRepository.findById(statusId);
    }

    public Status update(Status status){
        return statusRepository.save(status);
    }

    public Status save(Status status){
        return statusRepository.save(status);
    }

    public void delete(Status status){
        statusRepository.delete(status);
    }

    public void deleteById(Long id){
        statusRepository.deleteById(id);
    }
}
