package com.poe.poe2220718.fizzbuzz;

public class FizzBuzz {

    public static String play(int number){ 

        if(number % 15 == 0) {
            return "FizzBuzz";
        }
        if(number % 3 == 0) {
            return "Fizz";
        }
        if(number % 5 == 0) {
            return "Buzz";
        }

        return ""+number;
        // return String.valueOf(number)
        // return Integer.toString(number)

    }
}