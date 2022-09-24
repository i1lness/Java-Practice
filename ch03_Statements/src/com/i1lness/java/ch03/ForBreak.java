package com.i1lness.java.ch03;

public class ForBreak {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i=0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 5) {
                System.out.println("5보다 크면 반복문을 중단합니다");
                break;
            }

            System.out.println("이번 숫자는 " + num + " 입니다");
        }
    }
}
