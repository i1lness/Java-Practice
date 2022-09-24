package com.i1lness.java.ch03;

public class WhileBasic {
    public static void main(String[] args) {
        int num = 3;
        int i = 1;

        while (i <= 9) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i += 1;
        }
    }
}
