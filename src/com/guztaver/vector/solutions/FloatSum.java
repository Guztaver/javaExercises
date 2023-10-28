package com.guztaver.vector.solutions;

import java.util.Scanner;

public class FloatSum {
    public FloatSum() {
        System.out.println("Float summation exercise:\n");

        var userInput = new Scanner(System.in);

        System.out.print("How many numbers you will type? ");
        var howManyFloats = userInput.nextInt();
        var floatVector = new float[howManyFloats];

        var sum = 0.0;
        for (var i = 0; i < floatVector.length; i++) {
            System.out.print("Type a number: ");
            floatVector[i] = (float) userInput.nextDouble();
        }

        for (float v : floatVector) {
            sum += v;
        }

        System.out.print("\nValues: ");
        for (float v : floatVector) {
            System.out.printf("%f ", v);
        }

        var avg = sum / floatVector.length;

        System.out.printf("\nSum: %f", sum);
        System.out.printf("\nMedia: %f", avg);

        userInput.close();
    }
}