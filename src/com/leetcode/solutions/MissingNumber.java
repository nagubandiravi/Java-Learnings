package com.leetcode.solutions;

import java.util.Arrays;

/**
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * 
 * @author RNAGUBAN
 */
public class MissingNumber {
    
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        int sum = 0;
        int count = nums.length;
        sum = count * (count + 1) / 2;
        
        for (int i=0; i<nums.length; i++) {
            sum -= nums[i];
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        int[] input = new int[]{0,1,3,2,6,5,7,9,8};
        int output = obj.missingNumber(input);
        System.out.println("Missing Number is--"+output);
    }
}
