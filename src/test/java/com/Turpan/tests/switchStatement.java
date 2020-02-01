package com.Turpan.tests;

import java.util.Scanner;

public class switchStatement {


    public static void main(String[] args) {


        System.out.println("Please enter a season");

        Scanner in=new Scanner(System.in);

        String pesil=in.next();

        switch (pesil){

            case "spring":
                System.out.println("please wear spring clothes");
                break;

            case "summer":
                System.out.println("please wear summer clothes");
                break;

            case "autumn":
                System.out.println("please wear fall clothes");
                break;

            case "winter":
                System.out.println("please wear winter clothes");
                break;

            default:
                System.out.println(pesil+" is not a season dumbass");




        }




    }

}
