package com.Turpan.tests;

import java.sql.SQLOutput;
import java.util.Scanner;

public class seasonChecker {

    public static void main(String[] args) {

        //1. ask him to enter season
        //2. check the season
        //3. advice him to dress accordingly
        System.out.println("What is the season now?");
        Scanner grab=new Scanner(System.in);
        String season=grab.nextLine();
        if(season.equalsIgnoreCase("winter")){

            System.out.println("Remember to put on thick clothes.");
        }
        else if(season.equalsIgnoreCase("summer"))
        {
            System.out.println("Time for the summer clothes");
        }else if (season.equalsIgnoreCase("fall"))
        {
            System.out.println("Time for the fall clothes.");
        }else if (season.equalsIgnoreCase("spring"))
        {
            System.out.println("Time for the spring clothes.");
        }else {

            System.out.println("That is not a season, dumbass!");
        }











    }
}
