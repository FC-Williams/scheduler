package com.scheduler.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scheduler.model.Status;
import com.scheduler.service.StatusService;

@RestController
@RequestMapping("/status")
public class StatusController {
    
    @Autowired
    private StatusService statusService;
    
    @GetMapping("/hola")
    public ResponseEntity<String> getAllUsers() {
        return ResponseEntity.ok("hola mundssso");
    }

    @GetMapping
    public ResponseEntity<List<Status>> findAll(){
        return  ResponseEntity.ok(statusService.findAll());
    }

    @PutMapping
    private ResponseEntity<Status> update(@RequestBody Status status){
         return ResponseEntity.ok(statusService.update(status));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Status>> findById(@PathVariable("id") Long statusId){
        return  ResponseEntity.ok(statusService.findById(statusId));
    }

    @PostMapping
    private ResponseEntity<Status> save(@RequestBody Status  status){
        Status statustmp = statusService.save(status);

        try {
            return ResponseEntity.created(new URI("api/status"+statustmp.getStatusId())).body(statustmp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).build();
        }
    }

    @DeleteMapping
    private void delete(@RequestBody Status status){
        statusService.delete(status);
    }

    @DeleteMapping("/{id}")
    private void deleteById(@PathVariable("id") Long id){
        statusService.deleteById(id);
    }
}
