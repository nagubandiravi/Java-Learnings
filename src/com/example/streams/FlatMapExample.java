/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author RNAGUBAN
 */
public class FlatMapExample {
    public static void main(String[] args) {
        Test t1 = new Test("Ravi");
        t1.getLanguages().add("Java");
        t1.getLanguages().add("HTML");

        Test t2 = new Test("John");
        t2.getLanguages().add("Scala");
        t2.getLanguages().add("Python");
        
        Test t3 = new Test("Bob");
        t3.getLanguages().add("Go");
        
        List<Test> obj = new ArrayList<>();
        obj.add(t1);
        obj.add(t2);
        obj.add(t3);
        
        List<String> languages = obj.stream().map(e -> e.getLanguages()).flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println("---------"+languages);
    }
}

class Test {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
    
    private List<String> languages = new ArrayList<>();
    
    Test(String name) {
        this.name = name;
    }
    
    
}
