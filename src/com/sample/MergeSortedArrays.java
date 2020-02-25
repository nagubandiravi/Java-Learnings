/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

/**
 *
 * @author RNAGUBAN
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a = new int[] {2,6,13,20,31};
        int[] b = new int[] {4,9,11,12,40,52};
        int[] output = new int[a.length + b.length];
        
        output = mergeArrays(a, output, b);
        printArray(output);
        
        System.out.println("-------------------------------------");
        
        a = new int[] {2,6,13,20,31};
        b = new int[] {4,9,11};
        output = new int[a.length + b.length];
        output = mergeArrays(a, output, b);
        printArray(output);
        
        System.out.println("-------------------------------------");
        
        a = new int[] {2,6,13,20,31};
        b = new int[] {};
        output = new int[a.length + b.length];
        output = mergeArrays(a, output, b);
        printArray(output);
        
    }

    public static void printArray(int[] output) {
        System.out.print("Output----");
        for (int m : output) {
            System.out.print(" "+m);
        }
        System.out.println("");
    }

    public static int[] mergeArrays(int[] a, int[] output, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        if (a.length == 0) {
            output = b;
        } else if (b.length == 0) {
            output = a;
        } else {
            while (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    output[k] = a[i];
                    i++;
                    k++;
                } else {
                    output[k] = b[j];
                    j++;
                    k++;
                }
            }
            while (i == a.length && j < b.length) {
                output[k] = b[j];
                j++;
                k++;
            }
            while (i < a.length && j == b.length) {
                output[k] = a[i];
                i++;
                k++;
            }
        }
        return output;
    }
}
