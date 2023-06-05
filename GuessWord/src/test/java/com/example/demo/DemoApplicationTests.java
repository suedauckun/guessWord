package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;

@SpringBootTest
class DemoApplicationTests {

    @Test
    public void testCorrectGuess() {
        String keyword = "sharpener";
        String guess = "sharpener";

        GuessProvider game = new GuessProvider();
        String result = game.checkGuess(keyword, guess);

        Assertions.assertEquals("Congratulations! You guessed the keyword correctly.", result);
    }

    @Test
    public void testIncorrectGuess() {
        String keyword = "sharpener";
        String guess = "sanctions";

        GuessProvider game = new GuessProvider();
        String result = game.checkGuess(keyword, guess);

        Assertions.assertEquals("correctly guessed letters = 3\n" +
                "letter in the right place = 1 / s\n" +
                "correctly guessed letters in the wrong place = 2 / an", result);
    }

    @Test
    public void testInvalidInput() {
        String keyword = "sharpener";
        String guess = "apple";

        GuessProvider game = new GuessProvider();
        String result = game.checkGuess(keyword, guess);

        Assertions.assertEquals("Invalid input! The word must have 9 letters.", result);
    }
}
