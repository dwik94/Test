package com.dennis;

public class Human extends Animal {
    String gender;

    Human(){

    }

    Human(String name, int age, String birthYear, String gender){
        super(name, age, birthYear);
        this.gender = gender;
    }
    @Override
    public void eat(){
        IO.println("Human is eating meatballs");
    }
}
