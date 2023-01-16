package com.api.pokemon.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RNG {

    public static Set<Integer> generateRandomNumbers(int count, int upperBound){

        Set<Integer> result = new HashSet<>();
        Random rand = new Random();

        while(result.size() < count){
            int randomNumber = rand.nextInt(upperBound);
            result.add(randomNumber);
        }

        return result;
    }
}
