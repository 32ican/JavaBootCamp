package com.bootCamp.section4.triviaQuiz;

import java.util.Scanner;

public class TriviaQuiz {

    public static void main(String[] args) {

        System.out.println("Welcome to Trivia Quiz, Please Choose the correct answer a,b,c, or d");
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("\n1. Which country held the 2016 Summer Olympics?\n" +
                "    \ta) China\n" +
                "    \tb) Ireland\n" +
                "    \tc) Brazil\n" +
                "    \td) Italy");
        String answer1 = scanner.nextLine();
        if (answer1.equals("c")){
            score += 5;
        }

        System.out.println("\n2\\. Which planet is the hottest?\n" +
                "    \ta) Venus\n" +
                "    \tb) Saturn\n" +
                "    \tc) Mercury\n" +
                "    \td) Mars");
        String answer2 = scanner.nextLine();
        if (answer2.equals("a")){
            score += 5;
        }
        System.out.println("\n3\\. What is the rarest blood type?\n" +
                "    \ta) O\n" +
                "    \tb) A\n" +
                "    \tc) B\n" +
                "    \td) AB-Negative\n" );
        String answer3 = scanner.nextLine();
        if (answer3.equals("d")){
            score += 5;
        }
        System.out.println("\n4\\. Which one of these characters is friends with Harry Potter?\n" +
                "    \ta) Ron Weasley\n" +
                "    \tb) Hermione Granger\n" +
                "    \tc) Draco Malfoy\n");
        String answer4 = scanner.nextLine();
        if (answer4.equals("a") || (answer4.equals("b"))){
            score += 5;
        }

        if (score >= 15){
            System.out.println("\nWow you know your Staff");
        }
        else if (score >=5 && score <15){
            System.out.println("\nNot bad!");
        }
        else if (score < 5){
            System.out.println("\nBetter luck next time.");
        }

    }
}
