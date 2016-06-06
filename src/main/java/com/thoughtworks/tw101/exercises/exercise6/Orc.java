package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Orc Class implements Monster Interface
 * Orcs start with 20 Health and are always named Orc
 * Orcs have a report
 * Created by matt on 6/4/16.
 */
class Orc implements Monster {
    public float health = 20;
    public final String name = "Orc";

    @Override
    public void takeDamage(int dmg) {
        this.health -= dmg;
    }

    @Override
    public void reportStatus() {
        System.out.println(this.name + ": " +  this.health);
    }
}