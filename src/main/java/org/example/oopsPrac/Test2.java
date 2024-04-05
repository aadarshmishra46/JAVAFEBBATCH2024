package org.example.oopsPrac;
import java.util.Objects;
//import org.example.oops.Test;

public class Test2 {
    public static void main(String[] args) {

      Integer a = 5;
      if(Objects.nonNull(a))
          System.out.println("not esle");
      else
          System.out.println("is null");

    }
}
