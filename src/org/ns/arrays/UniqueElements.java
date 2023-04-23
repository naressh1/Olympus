package org.ns.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {
    /*This method will print all unique elements contains in the List.\
      This code creates a List of integers called "myList" with some values,
      and a Set of integers called "set" initialized as an empty HashSet.

      The stream() method is then applied to the myList object,
      which creates a stream of elements to be processed.
      The filter() method is called on this stream to remove all elements that are already present in the set.
      The filter() method accepts a lambda expression that takes an integer "n" and checks whether it can be added to the set.
      If the add() method returns true, the element is added to the set and the filter() method returns true,
       which means that the element is not a duplicate.

     The forEach() method is then called on the resulting stream to print each non-duplicate element to the console.
     The forEach() method also accepts a lambda expression that takes a System.out::println method reference,
      which is a shorthand notation for a lambda expression that prints the value of each element to the console.
     So, in summary, the code filters out non-duplicate elements from the myList and prints them to the console using Java 8 streams and a HashSet.
   */
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();
        myList.stream()
                .filter(n -> set.add(n))
                .forEach(System.out::println);

    }
}
