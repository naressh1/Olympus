package org.ns.number;

public class CountDigit {

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            int reminder = n % 10;
            count = count + 1;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
       // System.out.println(countDigits(2345));

        //System.out.println(101/2);//50
        //System.out.println(10*2);//20
        System.out.println(10^2);
    }
}
