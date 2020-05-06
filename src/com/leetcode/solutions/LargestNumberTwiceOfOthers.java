/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.solutions;

/**
 * In a given integer array nums, there is always exactly one largest element.
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 * If it is, return the index of the largest element, otherwise return -1.
 * @author RNAGUBAN
 */
public class LargestNumberTwiceOfOthers {
    
    public static int dominantIndex(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        
        if (nums.length == 2) {
            if (nums[0] >= (2*nums[1])) {
                return 0;
            }else if (nums[1] >= (2*nums[0])) {
                return 1;
            }else{
                return -1;
            }
        }
        
        int largeNumber = nums[0];
        int previousNumber = nums[0];
        int largeIndex = 0;
        
        for (int i=0; i<nums.length; i++) {
            if (largeNumber < nums[i]) {
                previousNumber = largeNumber;
                largeNumber = nums[i];
                largeIndex = i;
            }
            if (largeNumber > nums[i] && previousNumber < nums[i]) {
                previousNumber = nums[i];
            }
        }
                
        if (largeNumber >= (2*previousNumber)) {
            return largeIndex;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] input = new int[]{3,6,1,0};
        int result = dominantIndex(input);
        System.out.println("Result--:"+result);
    }
}
