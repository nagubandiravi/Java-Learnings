
package com.leetcode.solutions;

/**
 *
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 * 
 * Example:
 * 
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 * 
 * @author RNAGUBAN
 */
public class NumberComplement {
    
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        char[] bin = binary.toCharArray();
        for (int i=0;i<bin.length; i++) {
            if (bin[i] == '1') {
                bin[i] = '0';
            } else {
                bin[i] = '1';
            }
        }
        binary = new String(bin);
        return Integer.parseInt(binary, 2);
    }
    
    public static void main(String[] args) {
        NumberComplement obj = new NumberComplement();
        int output = obj.findComplement(5);
        System.out.println("Complement---"+output);
    }
    
}
