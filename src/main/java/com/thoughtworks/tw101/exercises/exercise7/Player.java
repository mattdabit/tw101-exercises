package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * player class that inputs guesses
 * Created by matt on 6/6/16.
 */
public class Player {
    Scanner in = new Scanner(System.in);

    public int getGuess(){
        System.out.println("Enter an integer");
        int i = Integer.parseInt(in.next());

        System.out.println("You entered integer "+ i);
        return i;
    }
}
