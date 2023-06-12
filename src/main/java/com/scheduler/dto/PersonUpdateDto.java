package com.scheduler.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class PersonUpdateDto extends PersonCreateDto{
    @NotNull(message = "personId no puede ser null")
    @Min(value = 1, message = "La propiedad debe ser mayor a 0")
    private Long personId;
    
    public Long getPersonId() {
        return this.personId;
    }

    public PersonUpdateDto() {}

}
