package com.i1lness.java.ch02;

public class 비트연산자 {
    public static void main(String[] args) {
        //비트 AND(&)
        int a = 0x0A;       //1010
        int mask1 = 0x01;       //0001
        int mask2 = 0x02;       //0010
        System.out.println("16진수 a의 첫 번쨰 자리수는? " + (a & mask1));
        System.out.println("16진수 a의 두 번쨰 자리수는? " + (a & mask2));

        //비트 OR(|)
        System.out.println("7(111) OR 16(10000) = " + (7 | 16));
        System.out.println("8(1000) OR 15(1111) = " + (8 | 15));
    }
}
