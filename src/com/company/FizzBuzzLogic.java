package com.company;

public class FizzBuzzLogic {

    // Declare private data fields
    /* These data fields are initialized in the no-arg constructor
        through an object from the FizzBuzzChallenge class */
    private int lowerLimit;
    private int upperLimit;
    private int randomNumber1;
    private int randomNumber2;
    private int index = 0;

    /* No-arg constructor that initializes the data fields
     * with randomized values */
    public FizzBuzzLogic() {
        // Initialize randomNumber1 and randomNumber2 to random numbers individually
        randomNumber1 = (int)(1 + Math.random()  * 100);
        randomNumber2 = (int)(1 + Math.random()  * 100);
        // Initialize upperLimit to the greatest of randomNumber1 and randomNumber2
        upperLimit = (randomNumber2 < randomNumber1) ? randomNumber1 : randomNumber2;
        // Initialize lowerLimit to the least of randomNumber1 and randomNumber2
        lowerLimit = (randomNumber2 < randomNumber1) ? randomNumber2 : randomNumber1;
    }

    /* This method is responsible for returning a certain message
     * according to whether the passed integer is multiple of 3, 5, and 7.
     * Also, whether the number is multiple of both 3 and 5 is tested. */
    public String testMultiples(int num) {

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz"; // Return "Fizz Buzz" when multiple of both 3 and 5
        } else if (num % 3 == 0) {
            return "Fizz"; // Return "Fizz" when multiple of 3
        } else if (num % 5 == 0) {
            return "Buzz"; // Return "Buzz" when multiple of 5
        }  else if (num % 7 == 0) {
            if (num % 2 == 0) {
                // Return number without " - multiply of seven" when multiple of 7 and 2
                return Integer.toString(num);
            } else {
                // Return number with " - multiply of seven" when multiple of 7 but not of 2
                return Integer.toString(num) + " - multiple of seven";
            }
        } else
            // Return number if none of the conditions above are met
            return Integer.toString(num);
    }

    /* This method is responsible for creating the output
     * and display the result of program when called */
    public String displayFuzzBuzz() {
        // Create StringBuilder object to create the program output
        StringBuilder sb = new StringBuilder();

        String[] rockPaperScissorGame = {" - Rock", " - Paper"
                , " - Scissors", " - Lizard", " - Spock"};

        /* Before showing the FizzBuzz result, add "This won't take long...\n"
            if both lowerLimit and upperLimit are less than 10 */
        if (lowerLimit < 10  && upperLimit < 10)
            sb.append("This won't take long...\n");

        /* Add the FizzBuzz result to the StringBuilder object inside a for loop */
        for (int num = lowerLimit; num <= upperLimit; num++) {
            // If the number is even and greater than ten, add an alternating extension
            if (lowerLimit == upperLimit) {
                // Display "Shazam!!" if lowerLimit does not equal to upperLimit
            	return "Shazam!!";
            	
            } else {
            	// Otherwise process the FizzBuzz result
            	if (num % 2 == 0 && num > 10) {
                    if (index == 4)
                        /* If private data field index hits 4, reset to zero
                         to avoid ArrayIndexOutOfBoundsException */
                        index = 0;
                    else
                        /* Otherwise, increase to access all elements
                            in the String array rockPaperScissorGame */
                        index++;

                    sb.append(testMultiples(num) + rockPaperScissorGame[index] + "\n");
                } else {
                    // Otherwise, don't add the extension
                    sb.append(testMultiples(num) + "\n");
                }
            }
        }
        // Return the FizzBuzz result in the String format
        return sb.toString();
    }
}
