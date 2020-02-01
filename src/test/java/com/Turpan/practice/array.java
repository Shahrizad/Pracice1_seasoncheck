package com.Turpan.practice;

import java.util.Arrays;

public class array {

    public static void main(String[] args) {

        // 1. all the odd numbers less than 20
        // 2. all the even numbers between 80 to 100;
        // 3. all season
        // 4. all month
        int [] oddNum={1,3,5,7,9,11,13,17,19};
        int numL=oddNum.length;
        System.out.println("This array include "+numL+" elements which is less than 20" );

        int[] evenNum={82,84,86,88,90,92,94,96,98};
        int elenth=evenNum.length;
        System.out.println("This one includes "+elenth+" elements which is between 80 to 100");

        String [] season= {"Winter","Spring","Summer","Fall"};
        String [] month= new String[12];
        month[0]="Jan";
        month[1]="Feb";
        month[2]="Mar";
        month[3]="Apr";
        month[4]="May";

        System.out.println(Arrays.toString(season));
        System.out.println(Arrays.toString(month));





    }
}
