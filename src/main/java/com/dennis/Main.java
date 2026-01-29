package com.dennis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    void main() {

        Animal person_1 = new Human("Dennis", 31, "1994", "male");
        Animal cat_1 = new Cat("Silver", 6, "2020", "Huskatt");

        List<Animal> animals = new ArrayList<>();
        animals.add(person_1);
        animals.add(cat_1);

        for (Animal animal : animals) {
            animal.eat();
            IO.println(animal.name);
            if (animal instanceof Cat P){
                IO.println(P.race);
            }
        }
    }
}