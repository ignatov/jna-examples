package org.myapp;

import com.sun.jna.Library;

public interface MyLib extends Library {
  int calculate_str_len(String name);

  void register_callback(MyCallBack myc);

  int get_one();
}
