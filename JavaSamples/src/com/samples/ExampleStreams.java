package com.samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreams {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,5,6,2);

        // demonstrate map method
        List<Integer> square = numbers.stream().map(x -> x*x).collect(Collectors.toList());

        System.out.println(square);

        List<String> string_filter = Arrays.asList("Joe", "Andrea", "Tom");

        // demonstate string filter
        List<String> filter_string = string_filter.stream().filter(s -> s.startsWith("T")).collect(Collectors.toList());

        System.out.println(filter_string);

        // demonstrate sorted mechanism
        List<String> show_sorted = string_filter.stream().sorted().collect(Collectors.toList());
         System.out.println(show_sorted);

    }
}
