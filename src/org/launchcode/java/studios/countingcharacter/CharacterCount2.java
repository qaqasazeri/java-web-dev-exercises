package org.launchcode.java.studios.countingcharacter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word:");
        String name = scan.nextLine();
        int count;
        char[] charactersInString = name.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                if (map.containsKey(name.charAt(i))) {
                    // char c=name.charAt(i);
                    count = map.get(name.charAt(i));
                    map.put(name.charAt(i), ++count);

                } else {
                    //count=1;
                    map.put(name.charAt(i), 1);
                }

            }
        }
        for (Map.Entry<Character, Integer> counter : map.entrySet()) {
            System.out.println(counter.getKey() + " : " + counter.getValue());
        }
    }
}
