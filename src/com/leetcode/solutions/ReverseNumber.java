/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.solutions;

/**
 *
 * @author RNAGUBAN
 */
public class ReverseNumber {
    
    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        int output = obj.reverse(1534236469);
        System.out.println("---------------"+output);
        output = obj.reverse(1212121212);
        System.out.println("---------------"+output);
    }
    
    public int reverse(int x) {
        if (x > -1 && x < 9) 
            return x;
        
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return 0;
        
        int output = 0;
        int prev = 0;
        
        if (x < 0)
            output = output * (-1);
        
        while (x != 0) {
            int current =  (x % 10);
            output = (output * 10) + current;
            x = x / 10;
            
            if ((output - current)/10 != prev )
                return 0;
            
            prev = output;
            
        }
        
        return output;
    }
}
