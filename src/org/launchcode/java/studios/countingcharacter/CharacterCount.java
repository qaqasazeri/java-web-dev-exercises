package org.launchcode.java.studios.countingcharacter;

import java.lang.reflect.Array;
import java.util.*;

public class CharacterCount {
    public static void main(String[] args) {
        String name = "qann";
  int counter=0;
        ArrayList<Character> character=new ArrayList<>();

        for(int i=0; i<name.length();i++){
            character.add(name.charAt(i));
        }

        for(char ch:character){

            for(int i=0;i<character.size();i++){

              if(character.get(i).equals(ch)){
                  counter++;
              }

              }

         System.out.println(ch+" : "+counter);
            counter=0;
        }
        }
            }


