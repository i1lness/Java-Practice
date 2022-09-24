package com.i1lness.java.ch03;

public class IfNested {
    public static void main(String[] args) {
        int value = 100;

        if (value > 50){
            System.out.println(value + "는 50보다 큽니다.");
            if (value > 60){
                System.out.println(value + "는 60보다 큽니다");
            }
        }

        int length = 655;

        if (length > 1000) {
            System.out.println(length + "는 1000보다 큽니다");
        } else {
            if (length > 500) {
                System.out.println(length + "는 500보다 큽니다");
                if (length > 600) {
                    System.out.println(length + "는 600보다 큽니다");
                }
            }
        }
    }
}
