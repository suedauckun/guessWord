package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        GuessProvider game=new GuessProvider();
        String result = game.checkGuess("sharperner","strawberry");
        System.out.println(result);

       /* String keyword = "sharpener";
        List<Character> keywordLetters = new ArrayList<>();
        for (char c : keyword.toCharArray()) {
            keywordLetters.add(c);
        }

        Scanner scanner = new Scanner(System.in);
        int attempts = 20;

        while (attempts > 0) {
            System.out.print("Guess a 9-letter word: ");
            String guess = scanner.nextLine();

            if (guess.length() != 9) {
                System.out.println("Invalid input! The word must have 9 letters.");
                continue;
            }

            List<Character> guessLetters = new ArrayList<>();
            for (char c : guess.toCharArray()) {
                guessLetters.add(c);
            }

            int correctlyGuessedLetters = 0;
            int lettersInRightPlace = 0;
            List<Character> correctlyGuessedLettersInWrongPlace = new ArrayList<>();

            for (int i = 0; i < guessLetters.size(); i++) {
                char guessLetter = guessLetters.get(i);

                if (keywordLetters.contains(guessLetter)) {
                    correctlyGuessedLetters++;

                    if (keywordLetters.get(i) == guessLetter) {
                        lettersInRightPlace++;
                    } else {
                        correctlyGuessedLettersInWrongPlace.add(guessLetter);
                    }
                }
            }

            System.out.println("Correctly guessed letters: " + correctlyGuessedLetters);
            System.out.println("Letters in the right place: " + lettersInRightPlace);

            if (correctlyGuessedLettersInWrongPlace.size() > 0) {
                System.out.print("Correctly guessed letters in the wrong place: ");
                for (char c : correctlyGuessedLettersInWrongPlace) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }

            if (lettersInRightPlace == 9) {
                System.out.println("Congratulations! You guessed the keyword correctly.");
                break;
            }

            attempts--;
            System.out.println("Attempts left: " + attempts);
            System.out.println();
        }

        if (attempts == 0) {
            System.out.println("Game over! You couldn't guess the keyword.");
        }*/
    }
}
