package com.example.android.inclassassignment10_rachellockerman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Object(View view) {
        Intent intent = new Intent(MainActivity.this, Object.class);
        startActivity(intent);
    }

    public void List(View view) {
        Intent intent = new Intent(MainActivity.this, List.class);
        startActivity(intent);

    }

    public void Camera(View view) {
        Intent intent = new Intent(MainActivity.this, Camera.class);
        startActivity(intent);

    }

    public void Storage(View view) {
        Intent intent = new Intent(MainActivity.this, Storage.class);
        startActivity(intent);

    }
}
