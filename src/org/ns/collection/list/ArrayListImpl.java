package org.ns.collection.list;

import java.util.*;

public class ArrayListImpl {

    public static void main(String[] args) {
        //non sync
        List list = new ArrayList();
        list.add(1);
        list.add('A');
        list.add("Naresh");
        list.add(null);
        list.add(null);
        System.out.println(list); //[1, A, Naresh, null, null]

    }
}
