package com.cobeliii.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FunctionalConsumer {
    record Person(String name, int age) {}

    public static void main(String[] args) {
        printPerson.accept(new Person("Ahmed", 18));
        printSomething.accept("Hey", 3);
    }

    static Consumer<Person> printPerson = System.out::println;
    static BiConsumer<String, Integer> printSomething = (x,z) ->
            System.out.println(x + " " + z);
}
