package org.ns.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAUniqueElementInString {
    public static void main(String[] args) {
        String string = "naaresssh";
       List<String> list = Arrays.stream(string.split(""))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(s->s.getValue()==1).map(Map.Entry::getKey)
                .toList();
        System.out.println(list);
        //using java 8 forEachloop
        //list.forEach(System.out::println);

    }
}
