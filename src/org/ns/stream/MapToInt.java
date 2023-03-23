package org.ns.stream;

import java.util.Arrays;
import java.util.List;

public class MapToInt {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
        //converting String to Integer
        List<Integer> integerList = stringList.stream().mapToInt(number -> Integer.parseInt(number)).boxed().toList();
         integerList.forEach(System.out::println);
    }
}
