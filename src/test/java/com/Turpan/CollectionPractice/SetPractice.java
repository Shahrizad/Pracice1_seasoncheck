package com.Turpan.CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {

    // 1. List allows duplication, but Set doesnt allow duplication
    // 2. List is indexed, but set is not indexed.


    public static void main(String[] args) {

        List<Integer> san=new ArrayList<Integer>();

        san.add(20);
        san.add(20);
        san.add(30);

        System.out.println("List :"+san);
        System.out.println(san.get(san.size()-1));


        Set<Integer> number=new HashSet<Integer>();

        number.add(20);
        number.add(20);

        // no duplicate

        System.out.println("Set :"+number);

        Set<String> names=new HashSet<String>();

        names.add("Affirmative");
        names.add("Affirmative");
        names.add("affirmative");

        System.out.println(names);

        Set<Character> A=new HashSet<Character>();
        A.add('a');
        A.add('b');
        A.add('c');
        A.add('c');
        A.add('C');
        System.out.println(A);
        A.remove('c');
        System.out.println(A);
      //  A.clear();

        System.out.println(A);
        System.out.println(A.isEmpty());








    }
}
