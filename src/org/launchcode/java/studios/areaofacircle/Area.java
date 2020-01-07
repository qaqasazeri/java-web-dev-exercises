package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    static final double PI = 3.14159;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius::");

        double radius = input.nextDouble();

        double area=PI*radius*radius;

        System.out.print("The area of a circle of radius" + radius+" is :"+Circle.getArea(radius));


        //Bonus mission
  int number;
      do  {
            System.out.println("Please enter a positive number!");
            while (!input.hasNextInt()) {
                System.out.println("That's not a number!");
                input.next();
            }
            number = input.nextInt();
        } while (number <= 0);
        System.out.println("Thank you! Got " + number);
}
}
