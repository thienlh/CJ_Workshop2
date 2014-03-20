/*
 * File name: Probl1.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 2 (cj_workshop1)
 * Date     : Mar 19 2014
 */
package cj_workshop2.Problems;

import java.util.Scanner;
//  Problem 1 implementation
public class Probl1 {

    protected int[] arr;
    public int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void input() throws Exception {
        arr = new int[100];
        n = 0;
        do {
            System.out.print("Please enter " + (n + 1) + "th number (not number = END): ");
            Scanner sc = new Scanner(System.in);
            arr[n] = sc.nextInt();
            n++;
        } while (true);
    }

    public void descSort() {
        int temp;   //  temporary value for swapping
        System.out.println("\nYou have entered " + (n + 1) + " element(s).");
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= i; j--) {
                if (arr[j] < arr[j + 1]) {
                    //  swap
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void list() {
        descSort();
        System.out.print("Sorted array: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public boolean validIndex(int begin, int end) {
        boolean value = false;
        if (begin >= 0 && begin <= n) {
            if (end >= begin && end <= n) {
                value = true;
            }
        }
        return value;
    }

    public void onDemandList() throws AssertionError {
        System.out.print("\n\nDo you want to use on-demand listing? (y/n): ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if ("y".equals(answer.substring(0, 1))) {
            System.out.print("\nEnter the begin index: ");
            int beginIndex = sc.nextInt();
            System.out.print("Enter the end index  : ");
            int endIndex = sc.nextInt();
            
            assert validIndex(beginIndex, endIndex);

            System.out.println("\nYour list (from index " + beginIndex + " to " + endIndex + "): ");

            for (int i = beginIndex; i <= endIndex; i++) {
                System.out.print(arr[i] + "  ");
            }
        }
        System.out.println();
    }
}
