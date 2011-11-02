package org.myapp;

import com.sun.jna.Native;

public class App {
  public static void main(String[] args) {
    MyLib lib = (MyLib) Native.loadLibrary("my", MyLib.class);
    lib.register_callback(new MyCallBack());

    System.out.println(lib.calculate_str_len("string for calculation"));

    System.out.println(lib.get_one());
  }
}