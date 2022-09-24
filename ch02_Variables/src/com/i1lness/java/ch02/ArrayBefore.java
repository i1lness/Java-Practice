package com.i1lness.java.ch02;

public class ArrayBefore {
    public static void main(String[] args) {
        int korean = 80;
        int math = 95;
        int english = 92;
        int science = 70;

        System.out.println("국어: " + korean);
        System.out.println("수학: " + math);
        System.out.println("영어: " + english);
        System.out.println("과학: " + science);

        double average = ((double)(korean + math + english + science)) / 4;

        System.out.println("i1lness의 평균 점수: " + average);

    }
}
