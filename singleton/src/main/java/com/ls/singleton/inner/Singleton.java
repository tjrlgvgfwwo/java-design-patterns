package com.ls.singleton.inner;

/**
 * 静态内部类单例
 */
public class Singleton {

  private Singleton() {

  }

  private final static class SingletonInnerHolder {
    private static final Singleton singleton = new Singleton();
  }

  public static Singleton getInstance() {
    return SingletonInnerHolder.singleton;
  }

  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

  }
}
