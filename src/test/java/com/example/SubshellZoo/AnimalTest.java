package com.example.SubshellZoo;

import com.example.SubshellZoo.Models.Animal;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AnimalTest {
    @Test
    public void testAnimalGetsUUIDAssigned(){
        //GIVEN
        Animal animal = new Animal(null,"Cow",200,10);
        //THEN
        assertNotNull(animal.id);
    }

    @Test
    public void testAnimalCreatedWithUUID(){
        //GIVEN
        Animal animal = new Animal(UUID.fromString("387cd923-6b67-4690-bfb4-c0c5dbab1d66"), "Elephant", 600, 10);
        //THEN
        assertEquals(UUID.fromString("387cd923-6b67-4690-bfb4-c0c5dbab1d66"),animal.id);
    }
}
