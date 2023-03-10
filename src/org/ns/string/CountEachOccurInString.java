package org.ns.string;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachOccurInString {
    //Count each occurance present in a given string
    //Naressshhh :: N -1 ,a:1,r:1,e:1,s:2 etc


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:: ");
        String inputString = scanner.next();
        /* Design:
         *  first convert given string into array and use Collector grouping
         * */
        String[] stringArray = inputString.split("");
        Map<String, Long> stringLongMap = Arrays.stream(stringArray)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringLongMap);
    }
}
