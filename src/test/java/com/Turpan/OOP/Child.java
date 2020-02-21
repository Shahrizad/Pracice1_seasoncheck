package com.Turpan.OOP;

import com.Atush.Practice.Parent;

public class Child extends Parent {

    public void children(){

        System.out.println("Being children is not easy");
    }


    public static void main(String[] args) {


        Child c=new Child();
        c.children();
        c.parents();






    }



}
