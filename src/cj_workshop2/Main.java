/*
 * File name: Main.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 2 (cj_workshop1)
 * Date     : Mar 19 2014
 */
package cj_workshop2;

import java.util.Scanner;
import cj_workshop2.Problems.*;

public class Main {

    //  Funtion that show the main screen and acept user option
    public static int mainscreen() {
        Scanner sc = new Scanner(System.in);
        //  Print out main screen
        System.out.println("*************************************************");
        System.out.println("*                                               *");
        System.out.println("*    THIENLHSE61374 - CORE JAVA - WORKSHOP 2    *");
        System.out.println("*                                               *");
        System.out.println("*************************************************");
        System.out.println("* 1          Problem 1: Array.                  *");
        System.out.println("* 2          Problem 2: Basic calculation       *");
        System.out.println("* 3          Problem 3: Work with matrix        *");
        System.out.println("* Other      Quit                               *");
        System.out.println("*************************************************");
        System.out.print("Enter your selection: ");
        //  Try to get user option
        try {
            return sc.nextInt();
        } catch (Exception e) {
            //  Quit program
            return 4;
        }
    }
//  main function

    public static void main(String[] args) {
        String userChoice;     //  Letting user to choose if they want to QUIT or not
        //  Loop until user want to quit
        do {
            //  Show the main screen
            int choice = mainscreen();
            //  Switch between options
            switch (choice) {
                case 1: //  Problem 1
                    System.out.println();
                    Probl1 p1 = new Probl1();
                    try {
                        p1.input();
                    } catch (Exception e) {
                        System.out.println("------------------INPUT ENDED!-------------------");
                        p1.setN(p1.getN() - 1);
                    } finally {
                        p1.list();
                        try {
                            p1.onDemandList();
                        } catch (AssertionError a) {
                            System.out.println("\n\tWRONG INPUT! \nIndexes must be from 0 to " + p1.getN());
                            System.out.println("and the end index must be equal or larger than \nthe begin index!");
                        } catch (Exception e) {
                            System.out.println("\n\tWRONG VALUE! \nIndex must be integer number.");
                        }
                    }
                    break;
                case 2: //  Problem 2
                    System.out.println();
                    Probl2 p2 = new Probl2();
                    try {
                        p2.input();
                        p2.display();
                    } catch (AssertionError a)  {
                        System.out.println("\n\tWRONG OPERATOR!");
                    }
                    catch (ArithmeticException ae) {
                        System.out.println("\n\tWRONG INPUT! \nYou can only enter integer number!");
                    }
                    break;
                case 3: //  Problem 3
                    System.out.println();
                    Probl3 p3 = new Probl3();
                    try {
                        p3.input();
                        p3.display();
                    } catch (AssertionError ae) {
                        System.out.println("\n\tWRONG INPUT!\nRow and column value can't be zero!");
                    } catch (Exception e) {
                        System.out.println("\n\tWRONG INPUT! \nYou can only enter integer number!");
                    }
                    break;
            }
            //  Promt user for quiting
            System.out.print("\nDo you want to QUIT? (y/N): ");
            Scanner sc = new Scanner(System.in);
            try {
                userChoice = sc.nextLine();
            } catch (Exception e) {
                userChoice = "q";
            }
        } while (userChoice.substring(0, 1).equals("n") || userChoice.substring(0, 1).equals("N"));
        System.out.println("HAVE A NICE DAY. GOODBYE!");
    }
}
