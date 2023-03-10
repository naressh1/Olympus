package org.ns.arrays;

import java.util.Arrays;

public class LongestElementInStringArray {
    public static void main(String[] args) {
        String[] strings = {"naresh","Java","Developer","SS&C Technologies llc"};

        String string = Arrays.stream(strings)
                .reduce((s1,s2)->s1.length()>s2.length()?s1:s2).get();
        System.out.println(string);
    }
}
