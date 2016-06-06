package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Random;

/**
 * A Game class that chooses a random number and interacts with a player
 * This class also decides if the player guesses too high or low
 * Created by matt on 6/5/16.
 */
public class Game {
    private int randInt;

    /**
     * get a random integer between min & max
     * @param min min value to get int
     * @param max max value to get int
     */
    protected void setRandInt(int min, int max) {
        Random rand = new Random();
        int n = rand.nextInt((max - min) + 1) + min;
        this.randInt = n;
    }

    protected void isGuessCorrect(int g){
        if(g == this.randInt){
            System.out.println("You guessed right! You Win!");
            System.exit(1);
        }else if (g < this.randInt){
            System.out.println("Your guess is too low. Guess again!");
        }else if (g > this.randInt){
        System.out.println("Your guess is too high. Guess again!");
    }
    }


}
