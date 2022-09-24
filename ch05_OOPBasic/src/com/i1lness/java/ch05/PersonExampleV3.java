package com.i1lness.java.ch05;

public class PersonExampleV3 {
  // 멤버변수
  private String firstName = "자바";
  private String lastName = "김";
  private int age = 25;
  private int height = 182;

  // 생성자
  public PersonExampleV3(String firstname, String lastname) {
    this.firstName = firstname;
    this.lastName = lastname;
  }

  public PersonExampleV3(String firstname, String lastname, int age) {
    this.firstName = firstname;
    this.lastName = lastname;
    this.age = age;
  }

  public PersonExampleV3(String firstname, String lastname, int age, int height) {
    this.firstName = firstname;
    this.lastName = lastname;
    this.age = age;
    this.height = height;
  }

  // 메서드
  public void goToOffice(String destination) {
    System.out.println(getKoreanName() + "님이 " + destination + "으로 출근합니다" + age + height);
  }

  private String getKoreanName() {
    return lastName + " " + firstName;
  }

  public static void main(String[] args) {
    PersonExampleV3 p = new PersonExampleV3("Java", "Kim");
    p.goToOffice("미국");
  }
}
