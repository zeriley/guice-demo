package com.zeriley.guicedemo;

import com.zeriley.guicedemo.api.AppApi;
import com.zeriley.guicedemo.api.AppApiImpl;
import com.zeriley.guicedemo.processors.DeliveryUpdateProcessor;
import com.zeriley.guicedemo.processors.Processor;
import com.zeriley.guicedemo.workers.DeliveryUpdater;
import java.util.HashMap;
import java.util.Map;

public class Server {

  private static Map<String, Processor> routes = new HashMap<String, Processor>();

  public Server() {
  }

  public static void main(String[] args) {
    setupRoutes();
    Processor p = routes.get("deliveryUpdate");
    p.process("", "");
  }

  private static void setupRoutes() {
    AppContext c = new AppContextImpl();
    DeliveryUpdater du = new DeliveryUpdater(c);
    AppApi api = new AppApiImpl(du);

    routes.put("deliveryUpdate", new DeliveryUpdateProcessor(api));
  }

}
