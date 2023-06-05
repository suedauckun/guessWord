package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GuessProvider {

    public String checkGuess(String keyword, String guess) {

        if (guess.length() != keyword.length()) {
            return "Invalid input! The word must have " + keyword.length() + " letters.";
        }

        int correctlyGuessedLetters = 0;
        int correctlyPlacedLetters = 0;

        StringBuilder correctlyGuessedLettersStr = new StringBuilder();
        StringBuilder correctlyPlacedLettersStr = new StringBuilder();


        for (int i = 0; i < keyword.length(); i++) {
            if (keyword.charAt(i) == guess.charAt(i)) {
                correctlyPlacedLetters++;
                correctlyPlacedLettersStr.append(keyword.charAt(i));
            }

            if (guess.indexOf(keyword.charAt(i)) != -1) {
                correctlyGuessedLetters++;
                correctlyGuessedLettersStr.append(keyword.charAt(i));
            }
        }

        if (correctlyPlacedLetters == keyword.length()) {
            return "Congratulations! You guessed the keyword correctly.";
        }

        return "correctly guessed letters = " + correctlyGuessedLetters +
                "\nletter in the right place = " + correctlyPlacedLetters + " / " + correctlyPlacedLettersStr + "\n" +
                "correctly guessed letters in the wrong place = " +
                (correctlyGuessedLetters - correctlyPlacedLetters) + " / " +
                correctlyGuessedLettersStr.toString().replace(correctlyPlacedLettersStr.toString(), "");
    }

}
