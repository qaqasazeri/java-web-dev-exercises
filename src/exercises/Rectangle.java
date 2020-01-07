package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the length of rectangle:");
        double length = input.nextDouble();
        System.out.println("Please enter the width of rectangle:");
        double width = input.nextDouble();


        System.out.print("The area of rectangle is: " + length * width);


    }
}
