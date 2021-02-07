package com.sample.kata;

public class FizzBuzz {

    public String printNumber() {
        String result = " ";
        for (int i = 1; i <= 100; i++) {
            result += i % 3 == 0 ? " " + "Fizz" : i % 5 == 0 ? " " + "Buzz" : " " + i;

        }
        return result;
    }
}
