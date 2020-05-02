package com.leetcode.solutions;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  
 * You want to know how many of the stones you have are also jewels.
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * 
 * Example 2:
 *
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * 
 * @author RNAGUBAN
 */
public class JewelsAndStones {
    
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        if (J.length() == 1 && S.length() == 1) {
            if (J.equals(S))
                return 1;
            else
                return 0;
        } else {
            
            for (char i:J.toCharArray()) {
                for (char m:S.toCharArray()) {
                    if (i==m) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        JewelsAndStones obj = new JewelsAndStones();
        String J = "Aa";
        String S = "AaAaAbbbbb";
        int count = obj.numJewelsInStones(J, S);
        System.out.println("Total Count::"+count);
    }
    
}
