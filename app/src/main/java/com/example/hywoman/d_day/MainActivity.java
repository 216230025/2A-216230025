package com.example.hywoman.d_day;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick1(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }
    public void onClick2(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr/"));
        startActivity(intent);
    }
    public void onClick3(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.daum.net/"));
        startActivity(intent);
    }
}
