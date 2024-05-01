package org.ns.arrays;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts){

       int maxWealth = 0;
       for(int[] subArr:accounts){
           int sumOfSubArr = 0;
           for(int value:subArr){
               sumOfSubArr = sumOfSubArr+value;
           }
           maxWealth = Math.max(maxWealth,sumOfSubArr);
       }

        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2},{2,3},{6,9}};
        int maximumWealth = maximumWealth(accounts);
        System.out.println(maximumWealth);

    }
}
