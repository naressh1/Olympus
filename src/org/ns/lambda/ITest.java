package org.ns.lambda;
@FunctionalInterface
public interface ITest {

    String wish(String name);
    default  int testAdd(int a, int b){
        return a+b;
    }
    static void hello(){
        System.out.println("Hi..");
    }
    default  int testMultiply(int a, int b){
        return a*b;
    }
    static void hi(){
        System.out.println("Hello..");
    }

}
