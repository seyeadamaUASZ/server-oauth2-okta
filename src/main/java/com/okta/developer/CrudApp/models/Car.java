package com.okta.developer.CrudApp.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
public class Car {
    @Id @GeneratedValue
    public Long id;
    @NotNull
    public String name;
}
