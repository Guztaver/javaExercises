package com.guztaver.vector.solutions;

import java.util.Scanner;

public class NegativeNumber {
    public NegativeNumber() {
        System.out.println("Negative Number exercise: ");

        var userInput = new Scanner(System.in);

        System.out.print("How much times you will type? ");
        var howMuchNumbers = userInput.nextInt();
        var numberNVector = new int[howMuchNumbers];

        for (var i = 0; i<numberNVector.length; i++) {
            System.out.print("Insert a new number: ");
            var numberN = userInput.nextInt();
            if (numberN > 10 || numberN < -10) {
                throw new Error("The number N is greater than 10 and less than -10, is " + numberN + "!!");
            }

            numberNVector[i] = numberN;
        }

        System.out.print("Negative numbers: ");

        for (int j : numberNVector) {
            if (j < 0) {
                System.out.printf("%d ", j);
            }
        }

        userInput.close();
    }
}
