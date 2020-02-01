package com.Turpan.tests;

import java.util.Scanner;

public class EnterNumber {
    // 1. ask to enter a number
    // 2. check the number
    //3. If it devided by 3, say "uzum", if it is divided by 4, say "puzum", if it is divide  by both 3 & 4, say "uzumpuzum"
    // exp: if the number is 16, it prints " puzum", if it is 9, it prints "uzum", if it is 12 it prints "uzumpuzum"

    public static void main(String[] args){

        System.out.println("Please enter a number:");
        Scanner scan=new Scanner(System.in);
        int randonNum=scan.nextInt();


        if (randonNum%3==0 && randonNum%4!=0) {
            System.out.println("uzum");

        }else if(randonNum%4==0 && randonNum%3!=0){
            System.out.println("puzum");

        }else if(randonNum%3==0 && randonNum%4==0){

            System.out.println("uzumPuzum");
        }









    }






}
