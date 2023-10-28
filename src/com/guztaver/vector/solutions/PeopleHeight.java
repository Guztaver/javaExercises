package com.guztaver.vector.solutions;

import java.util.Scanner;
import com.guztaver.entities.Person;

public class PeopleHeight {
    public PeopleHeight() {
        System.out.println("People height exercise: ");
        var userInput = new Scanner(System.in);

        System.out.print("How many people you will type? ");
        var howManyPeopleToVector = userInput.nextInt();
        var personVector = new Person[howManyPeopleToVector];

        for (var i = 0; i < personVector.length; i++) {
            System.out.printf("%dº user data: \n", i + 1);

            System.out.print("Name: ");
            var personName = userInput.next();

            System.out.print("Age: ");
            var personAge = userInput.nextInt();

            System.out.print("Height: ");
            var personHeight = userInput.nextFloat();

            personVector[i] = new Person(personName, personAge, personHeight);
            System.out.print("\n");
        }

        var totalHeight = 0.0;
        var minorsNumber = 0;

        for (Person v : personVector) {
            if (v.personAge() < 16) {
                minorsNumber++;
            }
            totalHeight += v.personHeight();
        }

        var averageHeight = totalHeight / personVector.length;
        var minorPercent = ((double)minorsNumber / personVector.length) * 100.0;


        System.out.printf("Average people height: %.2f\n", averageHeight);
        System.out.printf("People that have less than 16 years: %.1f\n", minorPercent);

        for (Person v : personVector) {
            if (v.personAge() < 16) {
                System.out.printf("%s ", v.personAge());
            }
        }

        userInput.close();
    }
}