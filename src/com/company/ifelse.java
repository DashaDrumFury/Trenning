package com.company;

public class ifelse {
    public static void main(String[] args) {
        int a = 5;
        int b = (a == 5) ? 1 : 2;

        if (b == 0) {
            System.out.println("statement IF");
        } else if (b == 1 ) {
            System.out.println("statement ELSE-IF 1");
        } else if (b == 2 ) {
            System.out.println("statement IF 2");
        } else {
            System.out.println("statement ELSE");
        }

        if (b > 0) {
            System.out.println("b > 0");
        }

        if (b <= 0) {
            System.out.println("b <= 0");
        } else {
            System.out.println("b > 0");
        }
    }
}
