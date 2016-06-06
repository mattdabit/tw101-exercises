package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

//this main class just facilitates the game
public class Main {

    public static void main(String[] args) {
        int guess;
        Game game = new Game();
        game.setRandInt(1, 100);
        Player player = new Player();
        System.out.println("Time to play a game.");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("I will tell you if you guessed too high or too low.");
        while (true){
            guess = player.getGuess();
            game.isGuessCorrect(guess);
        }
    }
}
