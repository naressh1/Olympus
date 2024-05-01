package org.ns.recursion;

public class NumberRecursion {
    public static void main(String[] args) {
        //print number 1 to 20 by using recursion
        printNumber(1);

    }
    static void printNumber(int n){
        if(n==20){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
}
