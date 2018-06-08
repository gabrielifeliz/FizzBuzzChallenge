package com.company;

import java.util.Random;

public class FizzBuzzLogic {

    private int lowerLimit;

    private int upperLimit;

    private int random1;

    private int random2;


    public FizzBuzzLogic() {
        Random random = new Random();
        random1 = 1 + random.nextInt(99);
        random2 = 1 + random.nextInt(99);
        upperLimit = (random2 < random1) ? random1 : random2;
        lowerLimit = (random2 < random1) ? random2 : random1;
    }

    public String displayFuzzBuzz() {
        StringBuilder sb = new StringBuilder();

        if (lowerLimit < 10  && upperLimit < 10)
            sb.append("This won't take long...\n");

        for (int num = lowerLimit; num <= upperLimit; num++) {
            sb.append(fizzBuzzShazam(num, lowerLimit, upperLimit) + "\n");
        }
        return sb.toString();
    }

    public String fizzBuzzShazam(int num, int lowerLimit, int upperLimit) {

        if (lowerLimit != upperLimit) {
            return testMultiples(num);
        } else {
            return "Shazam!!";
        }
    }

    public String testMultiples(int num) {
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
    }
}