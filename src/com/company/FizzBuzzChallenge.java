package com.company;

import java.util.Random;

public class FizzBuzzChallenge {

    public static void main(String[] args) {

        Random random = new Random();
        int random1 = 1 + random.nextInt(99),
                random2  = 1 + random.nextInt(99);
        int lowerLimit = lowerLimit(random1, random2),
                upperLimit = upperLimit(random1, random2);

        for (int num = lowerLimit; num <= upperLimit; num++) {
            System.out.println(FizzBuzzLogic(num, lowerLimit, upperLimit));
        }
    }

    public static String FizzBuzzLogic(int num, int lowerLimit, int upperLimit) {

        if (lowerLimit != upperLimit) {
            if (num % 3 == 0 && num % 5 == 0)
                return "Fizz Buzz";
            else if (num % 5 == 0)
                return "Buzz";
            else if (num % 3 == 0)
                return "Fizz";
            else if (num % 7 == 0)
                return Integer.toString(num) + " - multiple of seven";
            else
                return Integer.toString(num);
        } else {
            return "Shazam!!";
        }

    }

    public static int upperLimit(int random1, int random2) {

        return (random2 < random1) ? random1 : random2;
    }

    public static int lowerLimit(int random1, int random2) {

        return (random2 < random1) ? random2 : random1;
    }
}
