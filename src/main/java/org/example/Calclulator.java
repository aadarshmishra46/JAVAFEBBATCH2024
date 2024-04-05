package org.example;

import java.util.Scanner;


class Calclulator {

    public static void main(String[] args) {
        System.out.printf("Welcome to the Calculator \n Select the operation");
        Scanner sc = new Scanner(System.in);
        int opreation = sc.nextInt();
        System.out.println("opreation=" + opreation);
        if (opreation == 1) {
            for (int i = 0; i <= 2; i++)//
            {
                System.out.printf("Welcome to the Calculator \n Select the operation");

                opreation = sc.nextInt();
                System.out.println("b=" + opreation);
                int number1;
                int number2;
                if (opreation <= 5) {
                    System.out.println("Enter the first number and secondr");
                    number1 = sc.nextInt();
                    number2 = sc.nextInt();
                } else break;

                switch (opreation) {
                    case 1: {
                        System.out.println("Sum=" + (number1 + number2));
                    }
                    break;
                    case 2: {
                        System.out.println("sub=" + (number1 - number2));
                    }
                    break;
                    case 3: {

                        System.out.println("Mul=" + (number1 * number2));
                    }
                    break;
                    case 4: {

                        System.out.println("Div=" + (number1 / number2));
                    }
                    break;
                    case 5: {
                        System.out.println("Mod=" + (number1 % number2));

                    }
                    break;
                    default: {
                        System.out.println("Wrong Choice. Please try again");
                    }

                }
            }
        } else if (opreation == 2) {
            System.out.printf("Welcome to the Calculator \n Select the operation");

        } else {
            System.out.println("Wrong input!");
        }

    }



}
