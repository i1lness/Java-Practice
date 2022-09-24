package com.i1lness.java.ch03;

public class WhileBreak {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int i = 0;

        while (i < numbers.length) {
            int num = numbers[i];
            
            if (num > 5) {
                System.out.println("5보다 크면 반복문을 중단합니다.");
                break;
            }

            System.out.println("이번 숫자는 " + num + " 입니다");

            i += 1;
        }
    }
}
