package exercises;

import java.util.Scanner;

public class MilesPerGallon {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of miles: ");

        double miles = input.nextDouble();

        System.out.println("Enter amount of gas: ");

        double gasAmount = input.nextDouble();

        System.out.print("Miles-per-gallon is: " + miles / gasAmount);

    }
}
