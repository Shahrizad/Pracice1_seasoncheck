package com.Atush.Practice.MethodAndConstructor;

public class Carvana {

    public static void main(String[] args) {

        Car c1=new Car();

        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.price);
        c1.momotou();

        System.out.println("***********************************");

        Car c3=new Car(2020);

        System.out.println(c3.model);
        System.out.println(c3.year);
        System.out.println(c3.price);
        c3.momotou();


        System.out.println("***********************************");


        Car c2=new Car("Nissan",2015,10000);

        System.out.println(c2.model);
        System.out.println(c2.year);
        System.out.println(c2.price);



    }
}
