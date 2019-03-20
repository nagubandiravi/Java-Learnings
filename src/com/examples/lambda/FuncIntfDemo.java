/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.lambda;

/**
 *
 * @author RNAGUBAN
 */
public class FuncIntfDemo {
    
    FuncIntfDemo(int x, int y) {
        System.out.println("---"+(x * y));
    }
    
    public void addNumbers(int x, int y) {
        System.out.println("--"+(x+y)); 
    }
    
    public static void main(String[] args) {
        FuncIntfDemo obj = new FuncIntfDemo(5,5);
        obj.addNumbers(5, 5);
        
        TestFI intfObj = FuncIntfDemo::new;
        intfObj.display();
    }
}

@FunctionalInterface
interface TestFI {
    void add(int a, int b);
    
    default public void display() {
        System.out.println("-----Display - Default method");
    }
}