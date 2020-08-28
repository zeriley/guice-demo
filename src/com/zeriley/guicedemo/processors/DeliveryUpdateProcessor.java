package com.zeriley.guicedemo.processors;

import com.zeriley.guicedemo.api.AppApi;

public class DeliveryUpdateProcessor implements Processor {

  private AppApi api;

  public DeliveryUpdateProcessor(AppApi api) {
    this.api = api;
  }

  public void process(String request, String response) {
    api.deliveryUpdate(request);
  }
}
