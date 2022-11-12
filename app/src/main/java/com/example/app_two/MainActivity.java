package com.example.app_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int counter(int num) {
        return num * 52;
    }

    public double no(double a, double b) {
        return a / b;
    }

    public double yes(double a, double b) {
        return a / b;
    }

    public double yesss(double a) {
        return a + 122;
    }

    public double ragab(double a) {
        return a + 26;
    }

    public double hello(double a) {
        return a + 90;
    }

}