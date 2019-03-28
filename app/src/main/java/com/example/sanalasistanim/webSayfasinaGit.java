package com.example.sanalasistanim;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webSayfasinaGit extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_sayfasina_git);

        WebView webview = (WebView) findViewById(R.id.webViewKontrolu);
        webview.getSettings().setJavaScriptEnabled(true);

        final ProgressDialog progress = ProgressDialog.show(this, "Asistan'ım", "Sayfa Yükleniyor", true);

        webview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (progress.isShowing())
                    progress.dismiss();
            }
        });

        webview.loadUrl("https://gelecegiyazanlar.turkcell.com.tr/");


    }


}
