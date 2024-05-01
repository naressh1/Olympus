package org.ns.recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        //print nth fibonacci number
        //0,1,2,3,5,8
      /* int nthFibonacciNumber= printNthFibonacciNumber(4);
       System.out.println(nthFibonacciNumber);*/
        //print fibonaccinumbers upto given number
        //0,1,2,3..n  ->  n=(n-1)+(n-2)
        printNfibonacciNumbers(1,10);

    }

     static void printNfibonacciNumbers(int a,int N) {
        if(a>N){
            return;
        }
         System.out.println(a);
         a=a+1;
         printNfibonacciNumbers(a,N);
    }

    static int printNthFibonacciNumber(int n) {
        if (n < 2) {
            return n;
        }
        return printNthFibonacciNumber(n - 1) + printNthFibonacciNumber(n - 2);
    }
}
