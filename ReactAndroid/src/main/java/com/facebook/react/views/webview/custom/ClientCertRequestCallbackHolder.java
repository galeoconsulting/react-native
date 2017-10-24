package com.facebook.react.views.webview.custom;

import java.security.PrivateKey;

public class ClientCertRequestCallbackHolder {

  private static ClientCertRequestCallback callback;

  public static ClientCertRequestCallback getCallback() {
    return callback;
  }

  public static void setCallback(ClientCertRequestCallback callback) {
    ClientCertRequestCallbackHolder.callback = callback;
  }


}
