package exercises;

import java.util.Scanner;

public class RemoveTerm {
    public static void main(String[] args) {

        String sentence = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";


        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the term:");

        String term = input.nextLine();
       if(sentence.toUpperCase().contains(term.toUpperCase())){
           System.out.println("Index of term: "+sentence.toUpperCase().indexOf(term.toUpperCase()));
           System.out.println("Length of the term: "+term.length());

       }

       String start=sentence.substring(0,sentence.toUpperCase().indexOf(term.toUpperCase()));
       String end=sentence.substring(sentence.toUpperCase().indexOf(term.toUpperCase())+term.length());

       String newSentence=start+end;
        System.out.println("Start Sentence: "+start);
        System.out.println("End Sentence: "+end);
       System.out.println("New Sentence: "+newSentence);

       if(!sentence.equalsIgnoreCase(newSentence)){

           System.out.print("Term has been removed");
       }else
           System.out.print("Term has NOT been removed");

    }
}
