package org.example.oops;

//instance control Flow
class ParentP {

    int x = 10; //3i  //9r

    {// 4i
        m1(); //10
        System.out.println("FIIB"); //12
    }


    public ParentP() {//5i
        System.out.println("FIIB"); //13
    }

    public static void main(String[] args) { // 1i
        ParentP p = new ParentP(); //2i
        System.out.println("main"); //15
    }

    public void m1() {//6i
        System.out.println(y); //11
    }

    {//7i
        System.out.println("SIIB");
    }

    int y = 20; //8i //14

}