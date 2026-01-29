package com.dennis;

public class Cat extends Animal {
    String race;

    Cat(){

    }

    @Override
    public void eat() {
        IO.println("Cat eats fish");
    }

    Cat(String name, int age, String birthYear, String race){
        super(name, age, birthYear);
        this.race = race;
    }

}
