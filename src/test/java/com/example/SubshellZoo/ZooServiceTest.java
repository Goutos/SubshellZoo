package com.example.SubshellZoo;

import com.example.SubshellZoo.Models.Animal;
import com.example.SubshellZoo.Services.ZooService;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ZooServiceTest {
    @Test
    public void testFilterByName(){
        //GIVEN
        ZooService zooService = new ZooService();
        List<Animal> animals = new ArrayList<>();
        animals.add(ZooTestData.animals.get(0));
        animals.add(ZooTestData.animals.get(1));
        animals.add(ZooTestData.animals.get(2));

        //WHEN
        List<Animal>  result = zooService.getAnimalsFilteredByName(animals,"Elephant");

        //THEN
        assertEquals(1,result.size());

    }

    @Test
    public void testFeedAnimal(){
        //GIVEN
        ZooService zooService = new ZooService();
        List<Animal> animals = new ArrayList<>();
        animals.add(ZooTestData.animals.get(0));

        //WHEN
        float result = zooService.feedAnimal(animals,UUID.fromString("387cd923-6b67-4690-bfb4-c0c5dbab1d66")).weight;


        //THEN
        assertEquals(601,result,0);
    }
}
