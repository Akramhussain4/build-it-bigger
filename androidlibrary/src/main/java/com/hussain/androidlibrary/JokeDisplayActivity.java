package com.hussain.androidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static String JOKE_INTENT = "Joke_Intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        String joke = getIntent().getStringExtra(JOKE_INTENT);
        TextView tvJoke = findViewById(R.id.tvJoke);
        tvJoke.setText(joke);
    }
}
