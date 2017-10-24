package com.facebook.react.views.webview.custom;

import android.webkit.ClientCertRequest;
import android.webkit.WebView;

public interface ClientCertRequestCallback {
  void onReceivedClientCertRequest(WebView view, ClientCertRequest request);
}
