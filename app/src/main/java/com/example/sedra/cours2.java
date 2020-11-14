package com.example.sedra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class cours2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours2);

        WebView page = findViewById(R.id.web1);
        page.getSettings().setJavaScriptEnabled(true);
        page.loadUrl("https://www.google.com");

    }
}
