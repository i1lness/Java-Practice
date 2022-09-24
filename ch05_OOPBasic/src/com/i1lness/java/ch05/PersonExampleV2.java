package com.i1lness.java.ch05;

public class PersonExampleV2 {
  // 멤버변수
  String firstName = "자바";
  String lastName = "김";
  int age = 25;
  int height = 182;

  // 생성자
  PersonExampleV2(String firstname, String lastname) {
    this.firstName = firstname;
    this.lastName = lastname;
  }

  PersonExampleV2(String firstname, String lastname, int age) {
    this.firstName = firstname;
    this.lastName = lastname;
    this.age = age;
  }

  PersonExampleV2(String firstname, String lastname, int age, int height) {
    this.firstName = firstname;
    this.lastName = lastname;
    this.age = age;
    this.height = height;
  }

  // 메서드
  void goToOffice(String destination) {
    System.out.println(getKoreanName() + "님이 " + destination + "으로 출근합니다");
  }

  String getKoreanName() {
    return lastName + " " + firstName;
  }

  public static void main(String[] args) {
    PersonExampleV2 p = new PersonExampleV2("Java", "Kim");
    p.goToOffice("미국");
  }
}
