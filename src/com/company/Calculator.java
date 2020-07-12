package com.company;

import java.util.Scanner;

public class Calculator {
    Scanner scan = new Scanner(System.in);

    public int getInt() {
        int num;
        while (!scan.hasNextInt()) {
            System.out.println("The input is not an integer, enter again:");
            scan.next();
        }
        num = scan.nextInt();

        return num;
    }

    public char getOperation() {
        System.out.println("Select action:");

        char action = scan.next().charAt(0);
        if (action != '+' && action != '-' && action != '*' && action != '/') {
            System.out.println("Wrong symbol, enter only +, -, *, / :");

            return getOperation();
        }
        return action;
    }

    public void calculate(int a, int b, char action){
        int result;

        switch (action) {
            case '+':
                result = a + b;
                System.out.println(a + "+" + b + "=" + result);
                break;

            case '-':
                result = a - b;
                System.out.println(a + "-" + b + "=" + result);
                break;

            case '*':
                result = a * b;
                System.out.println(a + "*" + b + "=" + result);
                break;

            case '/':
                result = a / b;
                System.out.println(+a + "/" + b + "=" + result);
                break;

            default:
                System.out.println("Wrong symbol, enter only +, -, *, / :");

        }
        return;
    }

}










