package com.ls.singleton.evil;

/**
 * 恶汉单例模式
 */
public class Singleton {
  public static Singleton singleton = new Singleton();

  /**
   * 私有的构造器，使其不能通过new创建对象
   */
  private Singleton() {

  }

  /**
   * 提供静态的访问方法
   */
  public static Singleton getInstance() {
    return singleton;
  }

  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));
  }

}
