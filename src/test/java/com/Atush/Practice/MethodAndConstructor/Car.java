// Constructor must have same name with class name, does not have return type.
// Method may not or may have same name with class name, have return type.

package com.Atush.Practice.MethodAndConstructor;

public class Car {

    String model;
    int year;
    int price;


    public Car(){

        model="Toyota";
        year=2017;
        price=20000;
    }

    public Car(int yil){

        model="Honda";
        year=yil;
        price=18000;


    }

    public Car(String marka,int yil, int baha){

        model=marka;
        year=yil;
        price=baha;
    }

    public void momotou(){

        System.out.println("what is the meaning of  momotou ");
    }


}
