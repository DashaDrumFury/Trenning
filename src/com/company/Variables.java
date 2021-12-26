package com.company;

public class Variables {
    public static void main(String[] args) {
        int i = 1;
        long l = 2L;
        double d = 3.5d;
        boolean b;

        b = true;
        i++;
        i = i + 1;
        i += 1;
        b = i > 5;

        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("d = " + d);
        System.out.println("b = " + b);
    }
}
