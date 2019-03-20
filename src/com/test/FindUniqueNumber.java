package com.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RNAGUBAN
 */
public class FindUniqueNumber {
    
    public static void main(String[] args) {
        Integer[] input = new Integer[]{1,2,2,3,1,4,4};
        
        int res = input[0];
        for (int i = 1; i < input.length; i++) {
            res = res ^ input[i];
            System.out.println("-Intermediate--"+res);
        }
        
        System.out.println("---"+res);
    }
}
