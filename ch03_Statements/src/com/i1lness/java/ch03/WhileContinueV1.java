package com.i1lness.java.ch03;

public class WhileContinueV1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int i = 0;

        while (i < numbers.length) {
            int num = numbers[i];
            
            if (num <  5) {
                i += 1;
                continue;
            }

            System.out.println("이번 숫자는 " + num + " 입니다");
            i += 1 ;
        }
    }
}
