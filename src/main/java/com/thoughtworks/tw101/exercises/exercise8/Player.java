package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * player class that makes guesses
 * It also stores all guesses
 * Created by matt on 6/6/16.
 */
public class Player {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> guesses = new ArrayList<Integer>();

    public int getGuess(){
        System.out.println("Enter an integer");
        int i;
        try {
            i = Integer.parseInt(in.next());
        }catch (NumberFormatException ex){
            System.out.println("This program is expecting a number. Please enter a number. Try again.");
            return getGuess();
        }
        guesses.add(i);
        System.out.println("You entered integer "+ i);
        return i;
    }
}
