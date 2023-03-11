package org.ns.lambda;

public class TestImplementation {

    public static void main(String[] args) {
         ITest iTest = (param)-> param.toUpperCase();
        System.out.println(iTest.wish("Naresh"));
        System.out.println(iTest.testAdd(20,34));//accessing default method

    }


}
