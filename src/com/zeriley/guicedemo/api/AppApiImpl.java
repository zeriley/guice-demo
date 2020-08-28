package com.zeriley.guicedemo.api;

import com.zeriley.guicedemo.workers.DeliveryUpdater;

public class AppApiImpl implements AppApi {

  private DeliveryUpdater deliveryUpdater;

  public AppApiImpl(DeliveryUpdater deliveryUpdater) {
    this.deliveryUpdater = deliveryUpdater;
  }

  public void deliveryUpdate(String delivery) {
    deliveryUpdater.update(delivery);
  }
}
