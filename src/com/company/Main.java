package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Enter integer 1st number:\n");
        int a = calc.getInt();

        System.out.println("Enter integer 2nd number:\n");
        int b = calc.getInt();

        char c = calc.getOperation();
        System.out.println("Result of action:\n");
        calc.calculate(a, b, c);

    }
}
