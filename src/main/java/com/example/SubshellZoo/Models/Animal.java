package com.example.SubshellZoo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Animal {
    @JsonProperty("id")
    public UUID id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("weight")
    public Float weight;
    @JsonProperty("age")
    public Integer age;

    public Animal(UUID id,String name, float weight, int age) {
        this.id = (id != null) ? id : UUID.randomUUID();
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
}

