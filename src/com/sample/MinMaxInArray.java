package com.sample;

/**
 *
 * @author RNAGUBAN
 */
public class MinMaxInArray {
    
    public static void main(String[] args) {
        Integer[] input = new Integer[]{2,4,6,8,7};
        MinMaxInArray.findMaxMin(input);
        System.out.println("----------------------------------");
        input = new Integer[]{2,4,6,-8,7};
        MinMaxInArray.findMaxMin(input);
    }
    
    public static void findMaxMin(Integer[] obj) {
        if (null == obj || obj.length == 0) {
            return;
        } else {
            int min = obj[0];
            int max = obj[0];
            for (int i=1; i<obj.length; i++) {
                if (min > obj[i]) {
                    min = obj[i];
                }
                if (max < obj[i]) {
                    max = obj[i];
                }
            }
            
            System.out.println("Minimum Number in Array : "+min);
            System.out.println("Maximum Number in Array : "+max);
        }
    }
    
}