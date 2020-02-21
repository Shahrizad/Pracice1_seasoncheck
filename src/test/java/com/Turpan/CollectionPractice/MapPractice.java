package com.Turpan.CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {


    public static void main(String[] args) {


     //   Map<Key,Value> map=new HashSet<Key,Value>();

        Map<String,Integer> map=new HashMap<String, Integer>();

        map.put("shahrizat",18);
        map.put("axmetjan",300);
        map.put("turpan",3000);

        System.out.println(map);


        Map<String,String> dolet=new HashMap<String,String>();

        dolet.put("England","London");
        dolet.put("Japan","Tokyo");
        dolet.put("Turkey","Ankara");
        dolet.put("Malaysia","Kuala Lumpur");

        System.out.println(dolet);

        System.out.println(dolet.get("Turkey"));

        dolet.remove("England");

        System.out.println(dolet);

        // dolet.clear()

        System.out.println(dolet.size());

        for (String countries:dolet.keySet()){
            System.out.println(countries);
        }

        for (String capital: dolet.values()){

            System.out.print(capital+" ");
        }

        for (String d: dolet.keySet()){

            System.out.println("Key: "+d+" Value : "+dolet.get(d));
        }

    }
}
