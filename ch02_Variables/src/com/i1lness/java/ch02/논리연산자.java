package com.i1lness.java.ch02;

public class 논리연산자 {
    public static void main(String[] args) {
        int a = 4;
        boolean inTheMiddle = 3 < a && a < 5;
        boolean isNaturalNumber = a > 0 || a == 0;
        boolean isPositive = !(a < 0);

        System.out.println("a 는 3보다 크고 5보다 작다? " + inTheMiddle);
        System.out.println("a 는 자연수이다? " + isNaturalNumber);
        System.out.println("a 는 양수이다? " + isPositive);
    }
}
