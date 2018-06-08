package com.company;

public class FizzBuzzChallenge {

    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++)
            System.out.println(FizzBuzzLogic(num));
    }

    public static String FizzBuzzLogic(int num) {
        if (num % 3 == 0 && num % 5 == 0)
            return "Fizz Buzz";
        else if (num % 5 == 0)
            return "Buzz";
        else if (num % 3 == 0)
            return "Fizz";
        else if (num % 7 == 0)
            return String.valueOf(num) + " - multiple of seven";
        else
            return String.valueOf(num);
    }
}
