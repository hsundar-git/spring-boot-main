package com.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StandardInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no.of integers to read and write");
        try {
            int num = scanner.nextInt();
            int[] a = new int[num];
            for (int i = 0; i < num; i++) {
                System.out.println("Enter an integer value for position " + (i + 1));
                a[i] = scanner.nextInt();
            }
            System.out.println("User has entered the following integers");
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Incorrect input value is entered");
        }

    }
}
