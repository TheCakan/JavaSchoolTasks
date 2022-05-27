package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
    public static void main(String[] args) {
        Person prs = new Person();
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Emre",25));
        persons.add(new Person("Nikola",23));
        persons.add(new Person("Sude", 25));
        persons.add(new Person("Mark",27));

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o2, Person o1) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(persons);
        for (int i = 0; i <= persons.size(); i++) {
            for (int j = 0; j <= persons.size(); j++) {
                if (i > j) {
                    System.out.println("-");
                }
                else if (i == j) {
                    System.out.println("0");
                }
                else if (i < j) {
                    System.out.println("+");
                }
            }
        }
    }

    String name;
    int age;


    public Person(){



    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void compareTo(Object object) {


    }

    public static void sort(){

    }

}
