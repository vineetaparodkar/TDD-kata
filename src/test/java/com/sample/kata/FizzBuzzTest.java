package com.sample.kata;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void printNumber() {
    }

    //Test to return fizz if number divisible by 3
    @Test
    public void printFizz() {
        String result = new FizzBuzz().printNumber();
        Assert.assertTrue(result.contains("Fizz"));
    }

    //Test to return fizz if number divisible by 5
    @Test
    public void printBuzz() {
        String result = new FizzBuzz().printNumber();
        Assert.assertTrue(result.contains("Buzz"));
    }

    //Test to return fizzbuzz if number divisible by 3 & 5
    @Test
    public void printFizzBuzz() {
        String result = new FizzBuzz().printNumber();
        Assert.assertTrue(result.contains("FizzBuzz"));
    }



}