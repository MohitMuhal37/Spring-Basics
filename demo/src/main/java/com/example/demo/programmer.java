package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// import java.lang.*;
@Component 
public class programmer {
    @Autowired
    laptop lap; 
    public void code(){
        lap.compile();
        System.out.println("I am Doing Coding");
    }
}
