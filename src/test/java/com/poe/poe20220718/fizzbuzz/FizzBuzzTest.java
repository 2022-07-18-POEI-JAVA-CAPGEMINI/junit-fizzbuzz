package com.poe.poe20220718.fizzbuzz;

import com.poe.poe2220718.fizzbuzz.FizzBuzz;
//import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class FizzBuzzTest {

    @Test
    public void testMultipleTrois(){ 
        
       assertEquals("Fizz", FizzBuzz.play(6));
    }
    
    @Test
    public void testMultipleCinq(){ 
        
       assertEquals("Buzz", FizzBuzz.play(10));
    }
    
    @Test
    public void testNombreNormal(){ 
        
       assertEquals("2", FizzBuzz.play(2));
    }
        
    @Test
    public void testMultipleQuinze(){ 
        
       assertEquals("FizzBuzz", FizzBuzz.play(15));
    }
}