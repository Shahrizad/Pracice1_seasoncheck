package com.Turpan.Java;


import java.util.ArrayList;

public class WrapperClass {

    // int, char. boolean. double, byte, float, short, long

    // int  => Integer
    // char => Character
    // boolean=> Boolean
    // double=> Double
    // byte=>Byte
    // float=> Float
    // short=> Short
    //long => Long

    //String

    public static void main(String[] args) {

        Integer num=78;

    //    System.out.println(num);


        int[] num1={3,7,10};// you r very cute, i love you.
        int element=num1.length;


//        int[] san=new int[5];
//         san[6]=0;
//        System.out.println(san[6]);
//
//        System.out.println(element);


      //  ArrayList<WrapperClass> nameof=new ArrayList<Wrapperclass>();

        ArrayList<Object> number=new ArrayList<Object>();
        number.add(3);
        number.add(7);
        number.add(10);
        number.add(100);
        number.add(34);
        number.add("shahrizat");

        System.out.println(number);

    }
}
