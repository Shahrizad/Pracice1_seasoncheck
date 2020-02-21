package com.Turpan.practice;

import java.util.Arrays;

public class arrays {


    public static void main(String[] args) {


        int[] arr={2,3,4,5,6,7,4,3,4,6};

//        System.out.println(Arrays.toString(arr));
//
//        for(int num: arr){
//
//            System.out.print(num+" , ");
//        }


        String[] name={"shahrizat","ahmejtan","love"};

//        System.out.println(Arrays.toString(name));
////
////        for (String n:name){
////            System.out.print(n+" ");
////        }


        char[] vowel={'a','o','e','i','u'};

        Arrays.sort(vowel);
        System.out.println(Arrays.toString(vowel));

//        for (char V:vowel){
//            System.out.print(V+" , ");
//        }
//        System.out.println();


        int[] san={2,5,4,1,4,7,8,5,6,9};
        Arrays.sort(san);
//
//        System.out.println(Arrays.toString(san));


        System.out.println(san[san.length-1]);

        String str="sdfsdf";
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.substring(str.length()-1,str.length()));
















    }
}
