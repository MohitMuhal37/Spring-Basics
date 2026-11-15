package com.example;

public class programmer {

    programmer(){
        System.out.println("Object Created");
    }

    programmer(int age){
        System.out.println("Parameterised Object Created");
        this.age = age;
    }

    private int age;
    private laptop lap;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public laptop getLap(){
        return lap;
    }

    public void setLap(laptop lap){
        this.lap = lap;
    }
    void code(){
        System.out.println("I am Doing Coding");
        lap.compile();
    }
}
