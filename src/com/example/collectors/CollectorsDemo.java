/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Java 8 Collectors API learning.
 * @author RNAGUBAN
 */
public class CollectorsDemo {
    
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 24));
        persons.add(new Person("Jack", 28));
        persons.add(new Person("David", 32));
        persons.add(new Person("Bob", 19));
        persons.add(new Person("John", 54));
        persons.add(new Person("Bob", 33));
        persons.add(new Person("Tom", 40));
        persons.add(new Person("Tim", 5));
        
        // Fetch list of person names.
        List<String> names = persons.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println("List of Names - "+names);
        
        // Fetch list of person ages.
        List<Integer> ages = persons.stream().map(e -> e.getAge()).collect(Collectors.toList());
        System.out.println("List of Ages - "+ages);
        
        // Sum of all persons age.
        int sumOfAges = persons.stream().mapToInt(e -> e.getAge()).sum();
        System.out.println("Sum of Ages - "+sumOfAges);
        
        // Fetch list of person names whose age is > 30
        names = persons.stream().filter(e -> e.getAge() > 30).map(e -> e.getName()).collect(Collectors.toList());
        System.out.println("List of Names whose age is > 30 - "+names);
        
        // Filter duplicate names
        Set<String> uniqueNames = persons.stream().map(e -> e.getName()).collect(Collectors.toSet());
        System.out.println("List of Unique Names - "+uniqueNames);
        
        // Build Map of Age and Names
        Map<Integer, String> ageNameMap = persons.stream().collect(Collectors.toMap(Person::getAge, Person::getName));
        System.out.println("Map of Persons - "+ageNameMap);
        
        // Group persons by name
        System.out.println("Group by Names - "+ persons.stream().collect(Collectors.groupingBy(Person::getName)));
        
        // Join Names using '-' delimeter
        System.out.println("Join Names using '-' delimeter "+persons.stream().map(e -> e.getName()).collect(Collectors.joining("-")));
        
        // Join Names using '-' delimeter and * as prefix and suffix
        System.out.println("Join Names using '-' delimeter and * as prefix and suffix "+persons.stream().map(e -> e.getName()).collect(Collectors.joining("-", "*", "*")));
        
        // Group names into lists based on criteria: age > 20 or not
        Map<Boolean, List<Person>> partition = persons.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 20));
        System.out.println("Partitioned Lists-"+partition);
                
    }
    
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
