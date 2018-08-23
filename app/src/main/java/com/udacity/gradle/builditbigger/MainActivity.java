package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.hussain.androidlibrary.JokeDisplayActivity;
import com.hussain.jokesproviderlib.JokesProvider;


public class MainActivity extends AppCompatActivity {

    public static String JOKE_INTENT = "Joke_Intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        JokesProvider jokesProvider = new JokesProvider();
        String joke = jokesProvider.getRandomJoke();
        Intent intent = new Intent(this, JokeDisplayActivity.class);
        intent.putExtra(JOKE_INTENT, joke);
        startActivity(intent);
    }
}
