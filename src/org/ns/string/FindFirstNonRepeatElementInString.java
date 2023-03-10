package org.ns.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindFirstNonRepeatElementInString {
    public static void main(String[] args) {
        String string = "Nareshhhs";

       String stringOptional = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(s->s.getValue()==1)
                .findFirst().get().getKey();
        System.out.println(stringOptional);

    }
}
