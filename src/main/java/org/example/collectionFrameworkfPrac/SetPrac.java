package org.example.collectionFrameworkfPrac;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPrac {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();// like arraylist where duplicates are not aloowed.
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(4);
        System.out.println(set.size());
        System.out.println(set);






        Set<Integer> set1 = new LinkedHashSet<>();//like linkedlist where duplicate is not allowed.
        set1.add(5);
        set1.add(6);
        set1.add(7);
        System.out.println(set1);
    }
}

