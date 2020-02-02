package com.Turpan.Java;

import java.util.Scanner;

public class logicOperators {

    public static void main(String[] args) {

        //  && /  || / !


        int a=9;
        int b=8;
        int c=b+1;

        System.out.println(a==c);
        System.out.println(a!=b);



        System.out.println("Enter a number");
        Scanner in=new Scanner(System.in);

        int num=in.nextInt();

//        if(num%3==0 && num%4==0){
//            System.out.println("uzumpuzum");
//        }else {
//            System.out.println("wrong number dumbass!");
//        }

        if(num%3==0 || num%4==0){
            System.out.println("uzumpuzum");
        }else {
            System.out.println("wrong number dumbass!");
        }

        if(num!=0){
            System.out.println("it is not zero");
        }







    }
}
