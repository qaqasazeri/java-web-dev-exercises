package org.launchcode.java.demos.lsn1datatypes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {


        Scanner numbers=new Scanner(System.in);

        int size=numbers.nextInt();

        int max=-101;
        int counter=0;

        for(int i=0;i<size;i++){
            int n=numbers.nextInt();
            if(max<n){
                max=n;
               counter=0;
            }
             if(max==n){
                 counter++;
             }
        }

    System.out.print(counter);


    }
}
