package com.yourdreamreader.studio

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.view.WindowManager

class MainActivity : Activity() {
    private lateinit var web: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = android.graphics.Color.rgb(20, 16, 22)
        window.navigationBarColor = android.graphics.Color.rgb(20, 16, 22)
        window.decorView.systemUiVisibility = 0
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.allowFileAccess = true
        web.webViewClient = WebViewClient()
        web.webChromeClient = WebChromeClient()
        web.isVerticalScrollBarEnabled = false
        setContentView(web)
        web.loadUrl("file:///android_asset/index.html")
    }
    @Deprecated("Deprecated in Android API")
    override fun onBackPressed() {
        web.evaluateJavascript("if(window.readerBack){readerBack()} else {history.back()}", null)
    }
}
