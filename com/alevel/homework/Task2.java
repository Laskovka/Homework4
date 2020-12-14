package com.alevel.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter any sequence of numbers up to 10 in size.");
        Scanner scanner = new Scanner(System.in);
        double[] sequence = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + (i+1) + " number:");
            sequence[i] = scanner.nextDouble();
        }
        System.out.println("Enter \"max\" if you want to find the largest number, or \"min\" if you want to find the smallest number.");
        String scannerString = "";
        while (true) {
            scannerString = scanner.nextLine();
            if(scannerString.equals("max")) {
                System.out.println("Maximum number is " + getMax(sequence));
                break;
            } else if(scannerString.equals("min")) {
                System.out.println("Minimum number is " + getMin(sequence));
                break;
            }
        }
    }

    static double getMax(double... array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    static double getMin(double... array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
