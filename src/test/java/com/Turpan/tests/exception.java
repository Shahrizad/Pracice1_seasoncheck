package com.Turpan.tests;

public class exception {


    public static void main(String[] args) {




//        try{
//
//            int a=9;
//            int b=0;
//
//            System.out.println(a/b);
//
//        }catch (Exception e){
//
//            System.out.println(" you can not use divided by zero dumbass!");
//
//        }
//


        try {

            int[] arr=new int[3];


            arr[0]=1;
            arr[1]=2;
            arr[2]=3;
            arr[3]=4;

            System.out.println(arr[3]);


        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("be carefull with the index of array");
        }



    }
}
