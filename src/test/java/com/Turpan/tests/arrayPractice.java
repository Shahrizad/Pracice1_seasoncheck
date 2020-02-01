package com.Turpan.tests;

import java.util.Arrays;

public class arrayPractice {

    //1. primitive datatype : int, char, boolean, double, short,long, float,byte

    //2. byte-> -128~128

    byte num1=127;
    byte num2=-127;

    char letter='a';

    int numInt1=2147483647;
    int numInt2=-2147483647;

    double num=2147483647899999999999999999999999999999999999999999999999999.00;

    long numLong=2349234289479234792L;

    short numShort=32767;
    short numShort2=-32767;

    float numFloat=0.8734f;

    // double>float>long>int>short>byt

    //Arrays: is like a container

    int san=12;

    // arrayType[] arrayName

    int[] aj={2,5,8,9,10,4};

 //   String sh="shahrizat";
  //  int stringLength=sh.length();

    // in order to find how many elements does the array has, we use length

    int arrLength=aj.length;

    public static void main(String[] args) {


        int[] arr1={2,4,6,8,10,4,5,6,4,3,4,6,7,8,8,6,5,4,3,2,2,4,5,6,87,8,8,6,5,4,4,3};
        int arrLength=arr1.length;

        System.out.println("This array has "+arrLength+" elements.");

        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=3;
        arr[2]=5;
        arr[3]=7;
        arr[4]=9;

        // Arrays.toString()

        System.out.println(Arrays.toString(arr));

        String[] str={"France","japan","Paris"};
        String[] love=new String[3];

        love[0]="shahrizat";
       love[1]="ahmetjan";
        love[2]="loves";

        System.out.println(Arrays.toString(love));
        System.out.println(Arrays.toString(str));
        // 0 0 0 1
        // 0 0 1 0




    }




}
