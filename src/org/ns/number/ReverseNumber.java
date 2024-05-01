package org.ns.number;

public class ReverseNumber {

    static int reverseNumber(int n) {
        int revNum = 0;
        while (n > 0) {
            int reminder = n % 10;
            revNum = (revNum * 10) + reminder;
            n = n / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));
    }
}
