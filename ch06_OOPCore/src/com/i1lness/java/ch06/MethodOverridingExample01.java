package com.i1lness.java.ch06;

class ColoredParent {
  public String getPrimaryColor() {
    return "red";
  }

  public String getSecondaryColor() {
    return "blue";
  }
}

class PurpleChild extends ColoredParent {
  @Override
  public String getSecondaryColor() {
    return "purple";
  }
}

public class MethodOverridingExample01 {
  public static void main(String[] args) {
    // 1. 부모 객체 생성
    ColoredParent cp = new ColoredParent();
    System.out.println("1차 색상? " + cp.getPrimaryColor());
    System.out.println("2차 색상? " + cp.getSecondaryColor());

    // 2. 자식 객체 생성
    ColoredParent purple = new PurpleChild();
    System.out.println("1차 색상? " + purple.getPrimaryColor());
    System.out.println("2차 색상? " + purple.getSecondaryColor());
  }
}