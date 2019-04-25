/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.solutions;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string. If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * Example:
 *      Input: "Hello World"
 *      Output: 5
 * 
 * @author RNAGUBAN
 */
public class LengthOfLastWord {
    
    public int lengthOfLastWord(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        if (s.indexOf(" ") == -1 && s.length() > 0) {
            return s.length();
        }
        s = s.trim();
        return s.substring(s.lastIndexOf(" ")+1).length();
    }
    
    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        int length = obj.lengthOfLastWord("Hello World");
        System.out.println("-------"+length);
    }
    
}
