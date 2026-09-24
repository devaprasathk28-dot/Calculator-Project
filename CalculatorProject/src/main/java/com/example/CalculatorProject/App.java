package com.example.CalculatorProject;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("===== CALCULATOR =====");

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int result = calculator.subtract(a, b);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
