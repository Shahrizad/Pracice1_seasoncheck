package com.Turpan.practice;

public class arrayPractice2 {

    public static void main (String[] args){

        int[] even={2,3,1,4,5,6,7,5,4,10};

        int evenLength=even.length;

      //  System.out.println("The array has "+evenLength+" elements");

        for(int i=0;i<evenLength;i++){


           System.out.println("The array index "+i+" is "+even[i]);
        }



        int[] arr={2,5,3,6,7,5,6,9,8,4,1,2,3};

        int firstElement=arr[0];
        int thirdElement=arr[2];
        int lastElement=arr[arr.length-1];
        int midElement=arr[arr.length/2];

     //   System.out.println(firstElement);
        System.out.println(thirdElement);






    }




}
