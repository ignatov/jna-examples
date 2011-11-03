package org.myapp;

public class App {
  static MyLib lib = MyLib.INSTANCE;

  public static void main(String[] args) {
    lib.register_callback(new MyCallBack());

    System.out.println(lib.calculate_str_len("string for calculation"));

    System.out.println(lib.get_one());

    System.out.println(lib.get_two());
  }

  public static void print() {
    System.out.println(lib.get_two());
  }

  public int get2() {
    return lib.get_two();
  }

  public static int get3() {
    return lib.get_two();
  }
}