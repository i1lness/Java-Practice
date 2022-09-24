package com.i1lness.java.ch04;

public class StringIndexOf {
    public static void main(String[] args) {
        // 1. indexOf()
        String poem =
        "Two roads diverged in a yellow wood,\n" + 
        "And sorry I could not travel both";

        int firstAndPosition = poem.indexOf("And");
        int firstIPosition = poem.indexOf("I");
        System.out.println("And 의 첫 위치는 " + firstAndPosition);
        System.out.println("I 의 첫 위치는 " + firstIPosition);

        int secondLineIndex = firstAndPosition;
        System.out.println("두 번째 줄의 위치는 " + secondLineIndex);
        System.out.println("두 번째 줄의 내용은" + poem.substring(secondLineIndex));

        // 2. lastIndexOf()
        poem += "\nAnd be one traveller, long I stood";

        int lastAndPosition = poem.lastIndexOf("And");
        System.out.println("And의 마지막 위치는" + lastAndPosition);
    }
}
