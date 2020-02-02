package com.Turpan.Java;

public class casting {


    public static void main(String[] args) {

        // double is larger container than int

        int numInt=18;
        double numDouble=numInt;


        System.out.println(numDouble);

        double doub=12.14;
        int num=(int)doub;

        System.out.println(num);

        // double > float > long > int > short > byte

        byte by=110;
        int san=by;

        int san2=40;
        byte by2=(byte)san2;

        System.out.println(by2);





        // int VS. short

        int sh=160;
        short aj=(short)sh;


        // byte VS double

        byte d=4;
        double k=d;
        System.out.println(k);

        double g=10;
         byte f=(byte)g;
        System.out.println(f);


    }
}
