/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author RNAGUBAN
 */
public class FileToString {
    
        public static void main(String[] args) throws IOException {
                String content = new String(Files.readAllBytes(Paths.get("D:/text.txt")));
                System.out.println("---------"+content);
        }
}
