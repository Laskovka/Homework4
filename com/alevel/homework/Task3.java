package com.alevel.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter any sequence of numbers up to 10 in size.");
        Scanner scanner = new Scanner(System.in);
        double[] sequence = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + (i + 1) + " number:");
            sequence[i] = scanner.nextDouble();
        }
        System.out.println("Enter \"sort ascending\", ");
        System.out.println("if you want to sort the numbers in ascending order, ");
        System.out.println("or \"sort descending\", ");
        System.out.println("if you want to sort the numbers in descending order.");
        String line = "";
        while (true) {
            if(scanner.nextLine().equals("sort ascending")) {
                Arrays.sort(sequence);
                System.out.println("Your numbers are sorted in ascending order.");
                for (int i = 0; i < sequence.length; i++) {
                    line+=sequence[i]+", ";
                }
                System.out.println(line.substring(0, line.length()-2));
                break;
            } else if(scanner.nextLine().equals("sort descending")) {
                Arrays.sort(sequence);
                System.out.println("Your numbers are sorted in descending order.");
                for (int i = sequence.length-1; i >= 0; i--) {
                    line+=sequence[i]+", ";
                }
                System.out.println(line.substring(0, line.length()-2));
                break;
            }
        }
    }
}
