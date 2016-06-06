package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    int numIncrements;
    Accumulator(){
        this.numIncrements = 0;
    }


    //This function adds 1 to the public variable numIncrements
    public void increment() {
        this.numIncrements += 1;
    }
    //This function prints the number of times increment() is called
    public void total(){
        System.out.println(this.numIncrements);
    }
}
