package com.Turpan.Java;

class Ternary {

    public static void main(String[] args) {

        int num1=100;
        int num2=101;

        String max=(num1>num2) ? "num1 is greater than num2" : "num1 is not greater than num2";

    //    System.out.println(max);

        int maxNum=(num1>num2) ? num1:num2;

        System.out.println(maxNum);


        String str1="summer";
        String str2="Summer";

       // boolean summer=(str1.equals(str2))? true: false;
        String summer=(str1.equals(str2))?"uzum":"puzum";


        System.out.println(summer);










    }
}
