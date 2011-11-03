package org.myapp;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface MyLib extends Library {
  public MyLib INSTANCE = (MyLib) Native.loadLibrary("my", MyLib.class);

  int calculate_str_len(String name);

  void register_callback(MyCallBack myc);

  int get_one();

  int get_two();
}
