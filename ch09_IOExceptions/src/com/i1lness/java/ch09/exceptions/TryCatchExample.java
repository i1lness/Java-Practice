package com.i1lness.java.ch09.exceptions;

public class TryCatchExample {
  public static void main(String[] args) {
    // 1. null 생성
    // Object nullObj = null; // 실행할꺼면 주석 해제하세요

    // 2. try catch 문
    try {
      System.out.println("실행되는 문장");

      // null.toString(); // 실행할꺼면 주석 해제하세요

      System.out.println("여기는 도달하지 않습니다");
    } catch (NullPointerException e) {
      System.out.println("NullPointerException 발생: " + e.getMessage());
    }

    // 3. 확인
    System.out.println("이 문장은 실행됩니다");
  }
}
