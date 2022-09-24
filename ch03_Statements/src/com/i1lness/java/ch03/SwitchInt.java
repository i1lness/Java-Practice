package com.i1lness.java.ch03;

public class SwitchInt {
    public static void main(String[] args) {
        int[] monthDays = {31, 29, 31, 30, 31};

        for (int days : monthDays) {
            switch (days) {
                case 29:
                    System.out.println("이번 달은 29일 입니다");
                    break;
                case 30:
                    System.out.println("이번 달은 30일 입니다");
                    break;
                default:
                    System.out.println("이번 달은 31일 입니다");
            }
        }
    }
}
