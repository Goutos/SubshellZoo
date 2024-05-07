package com.example.SubshellZoo.Controllers;

import com.example.SubshellZoo.Models.Animal;
import com.example.SubshellZoo.Services.ZooService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(produces = "application/json")
public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    @PostMapping("/Animal")
    public String addAnimal(@RequestBody Animal animal) {
        animals.add(animal);
        return animal.toString();
    }

    @PostMapping("/removeAnimal/{id}")
    public void removeAnimal(@PathVariable UUID id) {
        animals.removeIf(animal -> animal.id.equals(id));
    }

    @PostMapping("/Animals/feed/{id}")
    public Animal feedAnimal(@PathVariable UUID id) {
        ZooService zooService = new ZooService();
        return zooService.feedAnimal(animals, id);
    }

    @GetMapping("/Animals")
    public List<Animal> getAnimals() {
        if (animals == null){
            return new ArrayList<>();
        }
        return animals;
    }

    @GetMapping("/Animals/FilterByName/{name}")
    public List<Animal> getAnimalsByName(@PathVariable String name) {
        ZooService zooService = new ZooService();
        return zooService.getAnimalsFilteredByName(animals,name);
    }
}

