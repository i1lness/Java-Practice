package com.i1lness.java.ch06;

class DefaultConstructorParentClass {

}

class PrivateConstructorParentClass {
  private PrivateConstructorParentClass() {

  }

  public PrivateConstructorParentClass(String arg) {
    System.out.println("PrivateConstructorParentClass 객체가 생성되었습니다. arg? " + arg);
  }

  // ------------------------------

  public void noErrorMethod() {
    System.out.println("이거 출력해줘");
  }

  public static void noErrorPlease() {
    PrivateConstructorParentClass s = new PrivateConstructorParentClass();
    s.noErrorMethod();
  }
}

class ChildClassA extends DefaultConstructorParentClass {
  public ChildClassA() {
    System.out.println("ChildCLassA 객체가 생성되었습니다");
  }
}

class ChildClassB extends PrivateConstructorParentClass {
  public ChildClassB(String arg) {
    super(arg);
  }
}

public class InheritanceBasic04 {
  public static void main(String[] args) {
    // 1. 부모 클래스에 생성자가 없는 경우
    /*
     * DefaultConstructorParentClass obj1 = new ChildClassA();
     * ChildClassA obj2 = new ChildClassA();
     */

    // 2. 부모 클래스에는 private 생성자만 존재하는 경우
    /*
     * PrivateConstructorParentClass obj3 = new ChildClassB("부모 클래스로 선언");
     * ChildClassB obj4 = new ChildClassB("자식 클래스로 선언");
     */
  }
}
