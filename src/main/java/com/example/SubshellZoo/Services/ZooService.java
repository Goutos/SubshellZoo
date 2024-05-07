package com.example.SubshellZoo.Services;

import com.example.SubshellZoo.Models.Animal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ZooService {
    public List<Animal> getAnimalsFilteredByName(List<Animal> animals, String name) {
        List<Animal> filteredAnimals = new ArrayList<>();
        if (animals != null) {
            for (Animal animal : animals) {
                if (animal.name.equals(name)) {
                    filteredAnimals.add(animal);
                }
            }
        }
        return filteredAnimals;
    }

    public Animal feedAnimal(List<Animal> animals,UUID id){
        if (animals != null) {
            for (Animal animal : animals) {
                if (animal.id.equals(id)) {
                    animal.weight += 1;
                    return animal;
                }
            }
        }
        return null;
    }
}
