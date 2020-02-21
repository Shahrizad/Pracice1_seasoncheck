package com.Turpan.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MN {


    public static void main(String[] args) {

        String str="loveYou";

        System.out.println(str.length());

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.substring(0,4)+" "+str.charAt(6));

        String[] names=new String[3];

        names[0]="shahrizat";
        names[1]="loves";
        names[2]="Axmetjan";

        System.out.println(Arrays.toString(names));



        for (String mamut:names){

            System.out.println(mamut);
        }


        System.out.println(names[2]);


       List<String> namess=new ArrayList<String>();
        namess.add("emet");
        namess.add("memet");
        namess.add("semet");

        System.out.println(namess);

        namess.add("axmet");

        System.out.println(namess);





    }
}
