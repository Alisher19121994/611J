package com.example.a611jcurrent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {

    Button button_uz;
    Button button_zh;
    Button button_ko;
    Button button_ja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initViews();
    }

    public void initViews() {
        button_uz = findViewById(R.id.b_uzbek);
        button_zh = findViewById(R.id.b_chinese);
        button_ko = findViewById(R.id.b_korean);
        button_ja = findViewById(R.id.b_japanese);

        button_uz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("uz");
            }
        });


        button_zh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("zh");
            }
        });


        button_ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("ko");
            }
        });


        button_ja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("ja");
            }
        });


    }

    public void setLocale(String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.setLocale(locale);
        getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());
        finish();
    }
}