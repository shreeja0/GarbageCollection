package com.company;

public class Main {

    public static void main(String[] args) {
	Runtime r = Runtime.getRuntime();
        System.out.println("the free memory of JVM before garbage collection is " + r.freeMemory() );
        r.gc();
        System.out.println("the free memory after JVM after garbage collection is " + r.freeMemory());
        //changed line with comment
    }
}
