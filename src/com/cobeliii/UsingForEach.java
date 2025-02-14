package com.cobeliii;

import java.util.Arrays;
import java.util.stream.Stream;

public class UsingForEach {
    public static void main(String[] args) {
        String[] names = {"Jamila", "Alex", "John"};
        Stream<String> stream = Arrays.stream(names);
        stream.forEach(System.out::println);
    }
}
