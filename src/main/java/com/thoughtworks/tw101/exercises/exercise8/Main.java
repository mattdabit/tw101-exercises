package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

public class Main {
    public static void main(String[] args) {
        int guess;
        boolean win;
        Game game = new Game();
        game.setRandInt(1, 100);
        Player player = new Player();
        System.out.println("Time to play a game.");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("I will tell you if you guessed too high or too low.");
        while (true){
            guess = player.getGuess();
            win = game.isGuessCorrect(guess);
            if (win){
                System.out.println("Here is a list of all your guesses:");
                System.out.println(player.guesses);
                System.exit(1);
            }
        }
    }
}
