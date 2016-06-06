package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Troll Class implements Monster Interface
 * Orcs start with 20 Health and are always named Orc
 * Orcs have a report
 * Created by matt on 6/4/16.
 */
public class Troll implements Monster{
    public float health = 40;
    public final String name = "Troll";

    @Override
    public void takeDamage(int dmg) {
        this.health -= dmg/2;
    }

    @Override
    public void reportStatus() {
        System.out.println(this.name + ": " +  this.health);
    }
}
