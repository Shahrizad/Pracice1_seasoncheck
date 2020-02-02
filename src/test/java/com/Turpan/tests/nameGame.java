package com.Turpan.tests;

import java.util.Scanner;

public class nameGame {

    public static void main(String[] args) {


        System.out.println("Enter a lovely name");
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();

        if(name.equalsIgnoreCase("shahrizat") || name.equalsIgnoreCase("aj")){

            System.out.println("lovely names");
        }else {

            System.out.println("not a lovely name");
        }



    }
}
