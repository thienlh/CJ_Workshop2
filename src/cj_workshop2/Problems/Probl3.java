/*
 * File name: Probl3.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 2 (cj_workshop1)
 * Date     : Mar 19 2014
 */
package cj_workshop2.Problems;

import java.util.Scanner;

public class Probl3 {

    protected int row, col;
    protected static int mat[][];

    public void input() throws AssertionError {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter number of row(s)   : ");
        row = sc.nextInt();
        System.out.print("Please enter number of column(s): ");
        col = sc.nextInt();
        assert (row != 0 && col != 0);
        mat = new int[row][col];
        System.out.print("\nEnter elements for the " + row + "x" + col + " matrix \n(use <space> for distinction): ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public int maxValue() {
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
        }
        return max;
    }

    public long sumValue()  {
        long sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                 sum += mat[i][j];
            }
        }
        return sum;
    }

    public void display() {
        System.out.println("\nYour entered matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.format("%5d", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("The maximum value is    : " + maxValue());
        System.out.println("The sum of all values is: " + sumValue());
    }
}
