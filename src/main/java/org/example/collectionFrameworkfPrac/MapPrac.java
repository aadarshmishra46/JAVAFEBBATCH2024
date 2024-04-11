package org.example.collectionFrameworkfPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPrac {
    public static void main(String[] args) {
        // key value--> key is uninu
        Map<String,String> map = new HashMap<>();
        map.put("name","Aadarsh");
        map.put("name","Deepak");
        map.put("sub","Math");
        map.put("sub","English");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.keySet());
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("id",2);
        hashMap.put("abc",50);

        //----------  student name, marks number , sub aadarsh 10 math deepka 14 english
        HashMap<String, ArrayList<String>>  hashMap1 = new HashMap();
        ArrayList values = new ArrayList();
        values.add("aadarsh");
        values.add("deepak");
        values.add("sumit");
        hashMap1.put("name",values);
    //    hashMap1.put("name",new ArrayList(Integer.parseInt("deepak")));

        System.out.println(hashMap1);






    }
}
