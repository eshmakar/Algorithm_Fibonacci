package com.test;

public class Fibonnacci {
    public static void main(String[] args) {
        System.out.println(fib(50));
    }
    private static long fib(int number){
        long ar[] = new long[number+1];
        ar[0] = 0;
        ar[1] = 1;
        for (int i = 2; i <= number; i++) {
            ar[i] = ar[i-1] + ar[i-2];
        }
        return ar[number];

    }

}
