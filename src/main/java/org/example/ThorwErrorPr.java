package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLDataException;

public class ThorwErrorPr {
    public static void main(String[] args) {
        try {
            hello();
        } catch (Exception e) {
            StringWriter sout = new StringWriter();
            System.out.println(sout+"hloe");
            e.printStackTrace(new PrintWriter(sout));
            sout.append(null);

         System.out.println(sout);
        }
    //    System.out.println("hello");
    }
    public static void hello(){
        int i=1/0;
    }
}
