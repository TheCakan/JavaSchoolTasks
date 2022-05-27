package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    Person prs = new Person();
    prs.compareTo(prs.age);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Emre",25));
        persons.add(new Person("Nikola",23));
        persons.add(new Person("Sude", 25));
        persons.add(new Person("Mark",27));


        for (int i = 0; i < persons.size(); i++) {
            for (int j = i+1; j < persons.size(); j++) {
                if (i > j)
                    System.out.println("-");
                if (i == j)
                    System.out.println("0");
                if (i< j)
                    System.out.println("+");
            }
        }



        }
    }

