package org.ns.arrays;

import java.util.Arrays;
import java.util.List;

public class TotalNoOfElements {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,7,8,9);
        long count = integerList.stream().count();
        System.out.println(count);
    }
}
