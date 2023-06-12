package com.scheduler.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class PersonCreateDto{
    @NotNull
    private Long statusId;

    @NotNull
    private String name;

    @NotNull
    private String lastName;

    private String mLastName;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthdate;

    @NotNull
    @Pattern(regexp = "[MF]")
    private String gender;

    @NotNull
    private String mail;

    @NotNull
    private String phoneNumber;

    @NotNull
    private String username;

    public PersonCreateDto(){}

    public PersonCreateDto(PersonCreateDto personCreateDto){
        this.statusId = personCreateDto.statusId;
        this.name = personCreateDto.name;
        this.lastName = personCreateDto.lastName;
        this.mLastName = personCreateDto.mLastName;
        this.birthdate = personCreateDto.birthdate;
        this.gender = personCreateDto.gender;
        this.mail = personCreateDto.mail;
        this.phoneNumber = personCreateDto.phoneNumber;
        this.username = personCreateDto.username;
    }


    public Long getStatusId() {
        return this.statusId;
    }
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMLastName() {
        return this.mLastName;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public String getGender() {
        return this.gender;
    }

    public String getMail() {
        return this.mail;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getUsername() {
        return this.username;
    }

}
