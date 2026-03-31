package app.samart.voyage

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainAct : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


            webView = findViewById(R.id.webView)

            // WebView settings
            webView.webViewClient = WebViewClient()
            webView.settings.javaScriptEnabled = true


            webView.loadUrl("https://planwithvoyage.vercel.app/")
        }

        // Back button support (important)
        override fun onBackPressed() {
            if (webView.canGoBack()) {
                webView.goBack()
            } else {
                super.onBackPressed()
            }

    }
}



