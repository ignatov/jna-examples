package org.myapp;

import com.sun.jna.Callback;

public class MyCallBack implements Callback {
  @SuppressWarnings("UnusedDeclaration")
  public void callback(String param1, String param2) {
    System.out.println("From C received 2 params:");
    System.out.println(param1 + ", " + param2);
  }
}
