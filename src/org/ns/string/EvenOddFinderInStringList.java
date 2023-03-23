package org.ns.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddFinderInStringList {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("3", "6", "8", "14", "15");
        List<Integer> evenIntegerList = stringList.stream().map(Integer::parseInt)
                .filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddIntegerList =stringList.stream().map(Integer::parseInt)
                .filter(j->j%2!=0).collect(Collectors.toList());

        evenIntegerList.forEach(System.out::println);
        oddIntegerList.forEach(System.out::println);

    }
}
