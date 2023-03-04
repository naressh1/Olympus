package org.ns.arrays;

public class CustomArrayMain {
    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomArrayList<>();
        customList.add(0,10);
        customList.add(1,20);
        for(Integer integer:customList){
            System.out.println(integer);
        }
        customList.forEach(integer -> System.out.println(integer));
    }
}
