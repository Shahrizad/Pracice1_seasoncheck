package com.Turpan.CollectionPractice;

import java.util.*;

public class practice1 {

    // List, Set

    public static void main(String[] args) {



//        List<Character> herip=new ArrayList<Character>();
//
//        herip.add('a');
//        herip.add('a');
//        herip.add('o');
//
//        System.out.println(herip);
//        System.out.println(herip.get(1));
//
//
//        Set<String> cities=new HashSet<String>();
//
//        cities.add("turpan");
//        cities.add("atush");
//        cities.add("turpan");
//
//        System.out.println(cities);


        Map<Character, Integer> Word=new HashMap<Character, Integer>();
        Word.put('A', 65);
        Word.put('B', 66);
        Word.put('C', 67);
        Word.put('D', 68);
        Word.put('E', 69);
        Word.put('F', 70);
        System.out.println(Word);
        System.out.println(Word.size());
        System.out.println(Word.get('F'));
        Word.remove('F',70);
        System.out.println(Word);

        for (char letter: Word.keySet()){
            System.out.print(letter+" , ");
        }
        System.out.println();
        for (int numbers:Word.values()){
            System.out.print(numbers+" , ");
        }










    }
}
