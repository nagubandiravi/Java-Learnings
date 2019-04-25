/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Arrays;

/**
 *
 * @author RNAGUBAN
 */
public class MyList<E> {
    
    private Object[] bag = new Object[5];
    
    private static int i=0;
    
    public void add(E e) {
        if (i < bag.length) {
            bag[i] = e;
            i++;
        } else {
            bag = Arrays.copyOf(bag, bag.length * 2);
            bag[i] = e;
            i++;
        }
        
    }
    
    public static void main(String[] args) {
        MyList obj = new MyList();
        int i=1;
        
        while (i<5) {
            obj.add(i);
            i++;
        }
                
        System.out.println("Current Elements--"+Arrays.asList(obj.bag));
        while (i<50) {
            obj.add(i);
            i++;
        }
        System.out.println("Current Elements--"+Arrays.asList(obj.bag));
        while (i<100) {
            obj.add(i);
            i++;
        }
        System.out.println("Current Elements--"+Arrays.asList(obj.bag));
    }
}
