package com.example.SubshellZoo;

import com.example.SubshellZoo.Models.Animal;

import java.util.List;
import java.util.UUID;

public class ZooTestData {
    public static List<Animal> animals = List.of(
            new Animal(UUID.fromString("387cd923-6b67-4690-bfb4-c0c5dbab1d66"), "Elephant", 600, 10),
            new Animal(null, "Lion", 110, 8),
            new Animal( null,"Tiger", 90, 6)
    );
}
