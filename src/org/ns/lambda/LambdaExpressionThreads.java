package org.ns.lambda;

public class LambdaExpressionThreads {

    public static void main(String[] args) {
        //without lambda
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm in Thread runnable");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        //With lambda
        Runnable r2 = ()->{
            System.out.println("I'm in thread runnable r2..");
        };
        Thread thread2 = new Thread(r2);
        thread2.start();
    }
}
