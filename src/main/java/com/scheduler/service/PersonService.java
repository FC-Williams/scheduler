package com.scheduler.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scheduler.dto.PersonCreateDto;
import com.scheduler.dto.PersonUpdateDto;
import com.scheduler.model.Person;
import com.scheduler.repository.PersonRepository;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Optional<Person> findById(Long id){
        return personRepository.findById(id);
    }

    public Person update(PersonUpdateDto personUpdateDto){
        Person person = new Person();
        person.setPersonId(personUpdateDto.getPersonId());
        person.setStatusId(personUpdateDto.getStatusId());
        person.setName(personUpdateDto.getName());
        person.setLastName(personUpdateDto.getLastName());
        person.setMLastName(personUpdateDto.getMLastName());
        person.setBirthdate(personUpdateDto.getBirthdate());
        person.setGender(personUpdateDto.getGender());
        person.setMail(personUpdateDto.getMail());
        person.setPhoneNumber(personUpdateDto.getPhoneNumber());
        person.setUsername(personUpdateDto.getUsername());
        
        return personRepository.save(person);
    }

    public Person save(PersonCreateDto personCreateDto){
        Person person = new Person();
        person.setStatusId(personCreateDto.getStatusId());
        person.setName(personCreateDto.getName());
        person.setLastName(personCreateDto.getLastName());
        person.setMLastName(personCreateDto.getMLastName());
        person.setBirthdate(personCreateDto.getBirthdate());
        person.setGender(personCreateDto.getGender());
        person.setMail(personCreateDto.getMail());
        person.setPhoneNumber(personCreateDto.getPhoneNumber());
        person.setUsername(personCreateDto.getUsername());

        return personRepository.save(person);
    }

    public void delete(Person person){
        personRepository.delete(person);
    }

}
