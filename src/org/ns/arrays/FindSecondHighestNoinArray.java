package org.ns.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestNoinArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 33, 4};
       Integer integer= Arrays.stream(a).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst()
               .get();
        System.out.println(integer);
    }
}
