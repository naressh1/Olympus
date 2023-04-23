package org.ns.arrays;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,99,32,15);
       Integer maxIntegerValue = myList.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(maxIntegerValue);
    }
}
