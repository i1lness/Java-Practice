package com.i1lness.java.ch02;

public class ConstantBasic {
    //1. 일반적 상수 정의 (기본 용법)
    static final double PI = 3.14159236; //원주율
    static final int MAX_COUNT = 100; // 최대 개수
    static final String COLUMN_STUDENT_NAME = "student_name"; //학생 이름 컬럼

    public static void main(String[] args) {
        //2. 함수 내 상수 정의 (필요한 경우)
        final int MAX_INTEGER = Integer.MAX_VALUE;

        //3. 함수 내 상수 선언 (비추천)
        final char DEFAULT_GRADE;

        //3-1. 함수 내 상수 정의 (가독성 떨어짐)
        DEFAULT_GRADE = 'C';

        System.out.println("상수 PI : " + PI);
        System.out.println("최대 개수 : " + MAX_COUNT);
        System.out.println("학생 이름 컬럼 : " + COLUMN_STUDENT_NAME);
        System.out.println("최대 int 값 : " + MAX_INTEGER);
        System.out.println("기본 성적 : " + DEFAULT_GRADE);

        // 상수의 이름에는 알파벳 대문자와 언더스코어(_) 만 사용함
    }
}
