package com.ls.singleton.lock;

/**
 * 双重锁实现单例
 */
public class Singleton {

  public volatile static Singleton singleton = null;

  private Singleton() {

  }

  public static Singleton getInstance() {
    if (null == singleton) {
      synchronized (Singleton.class) {
        if (null == singleton) {
          singleton = new Singleton();
        }
      }
    }
    return singleton;
  }

  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    System.out.println(s1 == s2);
    System.out.println(s1 == s2);

  }
}
