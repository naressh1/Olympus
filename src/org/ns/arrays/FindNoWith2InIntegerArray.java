package org.ns.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class FindNoWith2InIntegerArray {
    public static void main(String[] args) {
        int[] a = {12,32,22,24,123};
        List<String> strings =Arrays.stream(a).boxed()
                .map(s->s+"")
                .filter(d->d.startsWith("2"))
                                .toList();
        System.out.println(strings);
        
    }
}
