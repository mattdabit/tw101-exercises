package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        n += 2;
        for (int i = 1; i <= n; i+=2) {
            for (int j = 0; j < n - i / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        n +=2;
        if(n%2==0) {
            for (int i = 0; i <= n; i += 2) {
                for (int j = 0; j < n - i / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            for (int i = 1; i <= n; i += 2) {
                for (int j = 0; j < n - i / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (int i = n-2; i >= 1; i-=2) {
            for (int j = 0; j < n - i / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        n +=2;
        if(n%2==0) {
            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < n - i / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            for (int i = 1; i < n; i += 2) {
                for (int j = 0; j < n - i / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (int i = 1; i <= n-2; i++){
            System.out.print(" ");
        }
        System.out.println("Matt");
        for (int i = n-2; i >= 1; i-=2) {
            for (int j = 0; j < n - i / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
