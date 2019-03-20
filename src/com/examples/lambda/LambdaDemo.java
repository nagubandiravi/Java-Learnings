package com.examples.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
    
    public void display(){
        System.out.println("display");
    }
    
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("Ravi");
        input.add("John");
        input.add("David");
        
        input.forEach(
            (names)->System.out.println(names)
        );
        
        LambdaDemo obj = new LambdaDemo();
        obj.display();
    } 
    
}


