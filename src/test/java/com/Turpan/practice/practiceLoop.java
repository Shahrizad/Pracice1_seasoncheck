package com.Turpan.practice;

import java.util.Scanner;

public class practiceLoop {


    public static void main(String[] args) {


        // while loop
//
//        while (condition){
//
//            statement
//        }

        Scanner in=new Scanner(System.in);
        int i=0;

        System.out.println("Enter a name");
        while(i<=20000000){

           String name=in.nextLine();

           if(name.equals("shahrizat")){
               System.out.println("you r the most beautiful girl in the world");
           }else {

               System.out.println("just ordimary");
           }
        }




    }
}
