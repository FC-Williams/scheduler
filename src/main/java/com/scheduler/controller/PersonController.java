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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.scheduler.dto.PersonCreateDto;
import com.scheduler.dto.PersonUpdateDto;
import com.scheduler.model.Person;
import com.scheduler.service.PersonService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/persons")
public class PersonController {
    
    @Autowired
    PersonService personService;

    @GetMapping
    private ResponseEntity<List<Person>> findAll(){
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<Optional<Person>> findById(@PathVariable Long id){
        return ResponseEntity.ok(personService.findById(id));
    }

    @PutMapping
    private ResponseEntity<Person> update(@RequestBody PersonUpdateDto personUpdateDto){
        return ResponseEntity.ok(personService.update(personUpdateDto));
    }

    @PostMapping
    @ResponseBody
    private ResponseEntity<Person> save(@RequestBody @Valid PersonCreateDto personCreateDto){
        Person persontemp = personService.save(personCreateDto);
        try {
            return ResponseEntity.created(new URI("/persons/" + persontemp.getPersonId())).body(persontemp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping
    private void delete(@RequestBody Person person){
        personService.delete(person);
    }

}
