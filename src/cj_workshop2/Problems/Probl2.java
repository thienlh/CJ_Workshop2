/*
 * File name: Probl2.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 2 (cj_workshop1)
 * Date     : Mar 19 2014
 */
package cj_workshop2.Problems;

import java.util.Scanner;

public class Probl2 {

    protected int num1, num2;
    protected static int operator;

    public void input() throws AssertionError {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        num2 = sc.nextInt();
        String tempOperator = "+";
        System.out.print("Please choose the operator (+, -, *, /): ");
        
        tempOperator = sc.next();
        assert tempOperator.equals("+") || tempOperator.equals("-") || tempOperator.equals("*") || tempOperator.equals("/");
        if (tempOperator.substring(0, 1).equals("+")) operator = 1;
        if (tempOperator.substring(0, 1).equals("-")) operator = 2;
        if (tempOperator.substring(0, 1).equals("*")) operator = 3;
        if (tempOperator.substring(0, 1).equals("/")) operator = 4;
    }

    public void display() {
        System.out.println();

        if (operator == 1) {
            System.out.print(num1 + " + " + num2 + " = ");
            System.out.format("%7d\n", (num1 + num2));
        }
        if (operator == 2) {
            System.out.print(num1 + " - " + num2 + " = ");
            System.out.format("%7d\n", (num1 - num2));
        }
        if (operator == 3) {
            System.out.print(num1 + " * " + num2 + " = ");
            System.out.format("%7d\n", (num1 * num2));
        }
        if (operator == 4) {
            System.out.print(num1 + " / " + num2 + " = ");
            System.out.format("%7f\n", ((float) num1 / num2));
        }
    }
}
