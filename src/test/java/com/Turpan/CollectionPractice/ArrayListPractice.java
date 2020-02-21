package com.Turpan.CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {




    public static void main(String[] args) {




        List<Integer> myList=new ArrayList<Integer>();

        myList.add(2000);
        myList.add(2004);
        myList.add(2008);
        myList.add(2008);

        System.out.println(myList);


        List<String> fruits=new ArrayList<String>();
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("grape");
        fruits.add("melon");
        System.out.println(fruits);

        // 1.To add elements => fruits.add()

        fruits.add("potato");

        // 2. how many elements => fruits.size()

        int NumOfElements=fruits.size();

        System.out.println(NumOfElements);

        //3 .find and print based in index => fruits.get(1);

        System.out.println(fruits.get(1));
        System.out.println(fruits.get(fruits.size()-1));

        // 4. remove an element fruits.remove(1)

        System.out.println(fruits);
        fruits.remove(1);
        System.out.println(fruits);

        // 5. change value  fruits.set(0,"banana")

        fruits.set(0,"banana");

        System.out.println(fruits);

        //6 remove all fruits.clear();

        fruits.clear();

        System.out.println(fruits);












    }
}
