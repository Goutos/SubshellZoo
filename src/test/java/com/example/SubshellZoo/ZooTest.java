package com.example.SubshellZoo;

import com.example.SubshellZoo.Models.Animal;
import com.example.SubshellZoo.Controllers.Zoo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZooTest {
    @Test
    public void testAddAnimal() {
        //GIVEN
        Zoo zoo = new Zoo();

        //WHEN
        zoo.addAnimal(ZooTestData.animals.get(0));
        List<Animal> animals = zoo.getAnimals();

        //THEN
        assertEquals(1,animals.size());
    }

    @Test
    public void testRemoveAnimal(){
        //GIVEN
        Zoo zoo = new Zoo();
        zoo.addAnimal(ZooTestData.animals.get(0));
        zoo.addAnimal(ZooTestData.animals.get(1));
        zoo.addAnimal(ZooTestData.animals.get(2));

        //WHEN
        zoo.removeAnimal(UUID.fromString("387cd923-6b67-4690-bfb4-c0c5dbab1d66"));
        List<Animal> animals = zoo.getAnimals();

        //THEN
        assertEquals(2, animals.size());
    }

}
