/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.util.Arrays;

/**
 *
 * @author RNAGUBAN
 */
public class ToString {
    public static void main(String... doYourBest) {
        int[] anyArray = new int[5];
        anyArray[0] = 0;
        anyArray[1] = 2;
        anyArray[2] = 4;
        anyArray[3] = 6;
        anyArray[4] = 8;

        int[] otherArray = anyArray;
        doSum(anyArray);
        doSum(otherArray);

        Arrays.stream(anyArray).forEach(System.out::println);
        ToString obj = new ToString();
        System.out.println("----Class Loader---"+obj.getClass().getClassLoader().getParent().getClass().getSimpleName());
    }
   private static void doSum(int[] anyArray) {
        for (int i = 0; i < anyArray.length; i++) {
            anyArray[i] = anyArray[i] + 2;
        }
    }
}
