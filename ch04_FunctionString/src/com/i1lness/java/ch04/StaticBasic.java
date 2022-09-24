package com.i1lness.java.ch04;

public class StaticBasic {
    static double PIE = 3.141592;
    // 1. 함수 외부에 있는 변수에 붙이기 가능

    static boolean isPositive(int num) {
        return num > 0;
    }
    // 2. 함수 앞에 붙이기 가능

    public static void main(String[] args) {
        // 3. 함수 내부에는 붙일 수 없음

        System.out.println("PIE는 " + PIE + " 입니다");

        int num = 500;
        boolean isPositive = isPositive(num);
        System.out.println(num + "은 양수인가요 " + isPositive);
    }
}
