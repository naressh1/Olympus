package org.ns.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementsInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String inputString = scanner.next();
        List<String> stringList = Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(string -> string.getValue() > 1).map(Map.Entry::getKey)
                .toList();
        stringList.forEach(System.out::println);

    }
}
