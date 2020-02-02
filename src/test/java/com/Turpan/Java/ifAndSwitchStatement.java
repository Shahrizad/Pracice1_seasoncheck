package com.Turpan.Java;

public class ifAndSwitchStatement {

    public static void main(String[] args) {


        int age=18;

        if(age!=18){

            System.out.println("not forever 18");
        }else if(age==18){

            System.out.println("forever 18");
        }

        String season="summer";

        switch (season){

            case "spring":
                System.out.println("it is spring");
                break;

            case "summer":
                System.out.println("it is summer");
                break;

            case "autumn":
                System.out.println("it is fall");
                break;

            case "winter":
                System.out.println("it is winter");
                break;


        }



    }
}
