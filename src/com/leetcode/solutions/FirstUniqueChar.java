package com.leetcode.solutions;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 *  
 * @author RNAGUBAN
 */
public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        if (s.length() == 1) {
            return 0;
        } else {
            LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
            for (char c:s.toCharArray()) {
                Character obj = Character.valueOf(c);
                if (map.get(obj) != null) {
                    map.put(obj, -1);
                } else {
                    map.put(obj, s.indexOf(c));
                }
            }
            System.out.println("---------"+map);
            for (Map.Entry<Character, Integer> e: map.entrySet()) {
                if (e.getValue() > -1) {
                    return e.getValue();
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        FirstUniqueChar obj = new FirstUniqueChar();
        int output = obj.firstUniqChar("leetcode");
        System.out.println("Output---"+output);
        
    }
    
}
