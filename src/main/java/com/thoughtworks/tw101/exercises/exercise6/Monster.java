package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Monster Interface for Excersise 6 contains the methods
 * takeDamage & reportStatus
 * Created by matt on 6/4/16.
 */
public interface Monster {
    //takeDamage takes an int as an argument and
    //take the difference of the int from
    //the health of a monster to set the new Monster's
    //heath
    public abstract void takeDamage(int dmg);

    //reportStatus prints the name and current health
    //of a Monster
    public abstract void reportStatus();
}
