package com.homework1.beans.part7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class AnimalCollection {

    private List<Animal> animals;

    public List<Animal> getAnimals() {
        return animals;
    }

    @Autowired
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

}
