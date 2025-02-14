package com.cobeliii.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalFunction {
    record Person(String name, int age) {}

    public static void main(String[] args) {
        System.out.println(incrementByOne.apply(1));
        System.out.println(incrementByOne.andThen(doublingTheInput).apply(1));
        Person jamila = personMapper.apply("Jamila", 28);
        System.out.println(jamila);
    }


    static Function<Integer, Integer> incrementByOne = x -> x + 1;
    static Function<Integer, Integer> doublingTheInput = x -> (int) Math.pow(x,2);

    static BiFunction<String, Integer, Person> personMapper = Person::new;
}
