package com.dennis;

public abstract class Animal {
    String name;
    int age;
    String birthYear;

    Animal() {

    }

    Animal(String name, int age, String birthYear) {
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
    }

    public abstract void eat();

}