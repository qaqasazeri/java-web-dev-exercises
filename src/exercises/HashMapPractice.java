package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students=new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;


    do{
        System.out.print("Student: ");
        newStudent = input.nextLine();

        if(!newStudent.equals("")){
            System.out.print("ID: ");
            Integer id = input.nextInt();
            students.put(id,newStudent);
        }
        input.nextLine();
    }while(!newStudent.equals(""));


        for(Map.Entry<Integer,String>roster:students.entrySet()){
            System.out.print("Student name: "+roster.getValue()+";");
            System.out.print(" Student id: "+roster.getKey());
            System.out.println();
        }
    }

}
