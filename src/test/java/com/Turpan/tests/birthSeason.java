package com.Turpan.tests;

//Assignment One: use switch statement
//1. ask him to provide his month of birth,
//2. check the month
//3. tell him the season he was born accordingly. for example, if he was born on august, print " You were born on summer".

import java.util.Scanner;

public class birthSeason {
    public static void main(String[] args) {
        System.out.println("Which month were you born?");

        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("Ahh, a Winter baby!");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Hey, You were born in Spring!");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("You were born in hot Summer!");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("You were born in beautiful Fall! ^_^ ");
                break;
            default:
                System.out.println("Were you an Alien? ;p ");


        }
    }
}
