package com.zeriley.guicedemo.workers;

import com.zeriley.guicedemo.AppContext;

public class DeliveryUpdater {

  private AppContext c;

  public DeliveryUpdater(AppContext c) {
    this.c = c;
  }

  public void update(String delivery) {
    System.out.println("delivery is updated v[" + c.getVersion() + "]");
  }

}
