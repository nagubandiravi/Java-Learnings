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
public class FIDemo {
    public void myMethod(){  
	System.out.println("Instance Method");  
    }  
    public static void main(String[] args) {  
	FIDemo obj = new FIDemo();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }  
}

@FunctionalInterface 
interface MyInterface{  
    void display();  
}  
