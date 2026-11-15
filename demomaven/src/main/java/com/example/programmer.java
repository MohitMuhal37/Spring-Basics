package com.example;

public class programmer {

    programmer(){
        System.out.println("Object Created");
    }

    private int age;
    private laptop lap = new laptop();

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    } 

    void code(){
        System.out.println("I am Doing Coding");
        lap.compile();
    }
}
