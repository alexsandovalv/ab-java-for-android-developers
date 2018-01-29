package com.androidbootcamp.template;

/**
 * Created by eduardomedina on 2/02/17.
 */
public class FizzBuzz {

    public static String getResult(int number) {
        if (number % 15 == 0) return "fizzbuzz";
        else if (number % 3 == 0) return "fizz";
        else if (number % 5 == 0) return "buzz";
        return Integer.toString(number);
    }
}
