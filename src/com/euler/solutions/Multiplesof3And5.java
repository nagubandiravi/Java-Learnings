/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.euler.solutions;

import java.util.stream.IntStream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author RNAGUBAN
 */
public class Multiplesof3And5 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        
        sum = IntStream.range(1, 1000).filter(e -> (e%3 == 0 || e%5 == 0) ).sum();
        
        System.out.println("Sum--"+sum);
        
    }
}
