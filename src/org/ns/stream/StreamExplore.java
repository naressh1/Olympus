package org.ns.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExplore {
    public static void main(String[] args) {

        //Create stream by factory methods
        //type 1
        Stream<Integer> integerStream = Stream.of(1,2,34,4,55);
        integerStream.forEach(s-> System.out.println(s));
        //type 2'
        Stream<String> stringStream = Stream.of(new String[]{"a","b","c"});
        stringStream.forEach(s-> System.out.println(s));

        List<Integer> integerList = new ArrayList<>();
            integerList.add(1);
            integerList.add(2);

            //java 8
        List<String> stringList = Arrays.asList("a","b","c");
        List<String> b = stringList.stream()
                .filter(a -> a.equalsIgnoreCase("b"))
                .collect(Collectors.toList());

        System.out.println(b);
    }
}
