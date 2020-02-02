package com.Turpan.Java;

public class ComparisionOperators {

    public static void main(String[] args) {

        // >/< /=/<=/>=


        int a=67;
        double b=66.99;
        // a<b,if a<=b--->true, if it meets one of the condition then it's true. This is only for numbers
        //a>b,if a<=b--> false (string has different conditions)

        System.out.println(a>b);
        System.out.println(b<a);
        System.out.println((a>b)==(b<a));
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);



    }
}
