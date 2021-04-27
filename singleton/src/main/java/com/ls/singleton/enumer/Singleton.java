package com.ls.singleton.enumer;

/**
 * 枚举单例
 */
public enum Singleton {
  s;

  public void sayHello() {
    System.out.println("hello world");
  }

  public static void main(String[] args) {
    Singleton s1 = Singleton.s;
    Singleton s2 = Singleton.s;
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

  }
}
