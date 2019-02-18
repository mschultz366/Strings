//program allows user to enter answer
//program then tells user how they did
package com.company;
        import java.util.Scanner;
        
public class Main {

    public static void main(String[] args) {

        //Create a 5 question quiz, fill in blank, your subject use eq ignore case method

        String[] questions;
        String[] answers;

        Scanner sc = new Scanner(System.in);
        String input = "";

        int correct = 0;

        questions = new String[]{
                "Jack ___________ is a character in Nightmare before Christmas.",
                "_____ Jones is the Scooby Doo character with an ascot.",
                "Peter Parker is _________'s real name.",
                "Cheech Marin is a ______ in the Lion King.",
                "Cruella De Vil is in love with ___(s)."
        };

        answers = new String[] {
                "Skellington",
                "Fred",
                "Spiderman",
                "Hyena",
                "Fur"
        };


        for (int i = 0; i < 5; i++) {
            System.out.println(questions[i]);
            input = sc.nextLine();

            if (input.equalsIgnoreCase(answers[i])) {
                correct += 1;
            }
        }

        System.out.println("You got " + correct + " answers correct.");

    }
}