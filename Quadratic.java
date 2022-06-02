package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values of a, b and c in a quadratic equation a*x*x + b*x +c = 0 ");
        int a = scanner.nextInt();//15
        int b = scanner.nextInt();//68
        int c = scanner.nextInt();//3
        float delta = (b * b) - (4 * a * c);
        float root1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
        float root2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("The two roots of the Equation are : " + root1 + " and " + root2);
    }
}
