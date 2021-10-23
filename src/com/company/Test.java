package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        KalkNum KalkTest = new KalkNum();
        KalkNum[] kalkTests = new KalkNum[0];
        KalkOp kalkOp = new KalkOp();
        KalkOp[] kalkOps = new KalkOp[0];
        double num1;
        double num2;
        double ans;
        char op;
        char op2;
        String ravenstvo;

        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("...");
            num1 = reader.nextDouble();
            System.out.print("\nEnter an operator (+, -, *, /,=): ");
            op = reader.next().charAt(0);
            ravenstvo = reader.next();
            System.out.println("...");
            num2 = reader.nextDouble();

            switch (op) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    ans = num1 / num2;
                    break;
                default:
                    System.out.printf("Error! Enter correct operator");
                    return;
            }
        } while (true);
        private static String kalkStop ( String ravenstvo){
            String ravenstvo = ravenstvo;
            if (ravenstvo.toLowerCase(Locale.ROOT).contains("=")) {
                System.out.print("\nThe result is given as follows:\n");
                System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
            }
        }

    }
}