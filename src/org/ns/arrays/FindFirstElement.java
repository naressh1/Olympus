package org.ns.arrays;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,2,34,45);
        //Method 1:
        Integer integer = integerList.iterator().next();
        System.out.println(integer);
        //method 2:
        Integer firstInteger = integerList.stream().findFirst().get();
        System.out.println(firstInteger);
    }
}
