package com.example.imaginarone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToARCamera(View view)
    {
        Intent intent = new Intent(MainActivity.this, HelloSceneformActivity.class);
        startActivity(intent);
    }
}
