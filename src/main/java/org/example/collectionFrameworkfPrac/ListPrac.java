package org.example.collectionFrameworkfPrac;

import java.util.*;

public class ListPrac {

    // arraylist , linkedlist, vector, stack

    public static void main(String[] args) {
        List l = new ArrayList(); // [] ,{}
        l.add("aadarsh");
        l.add("sumit");
        System.out.println(l);
        System.out.println(l.size());

        //--------------
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(5);
        System.out.println(al);
        //----------------------
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(6);

        System.out.println(linkedList);
        //-------------
        // stack lifo last in first out
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);

        //vector same as arraylist + synchronized + some legacy method
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        System.out.println(vector);


    }
}
