package org.example.oops;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class testnull {
    public static void main(String[] args) {

        Map mp = new HashMap();

        if(!mp.isEmpty())
        {
            System.out.println("hello not null");
        }
        else {
            System.out.println("null");
        }
    }
}
