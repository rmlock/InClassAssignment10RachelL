package com.example.android.inclassassignment10_rachellockerman;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class Object extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference postRef;
    DatabaseReference users;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_object);
        database = FirebaseDatabase.getInstance();
        postRef = database.getReference("User");
        users =database.getReference("users");
    }

    public void Save(View view) {
        EditText name = (EditText) findViewById(R.id.name);
        String named = name.getText().toString();
        EditText placement = (EditText) findViewById(R.id.Placement);
        String placementLocation = placement.getText().toString();
        long currentTime = Calendar.getInstance().getTimeInMillis();
        String time = String.valueOf(currentTime);
        TextView textView = (TextView) findViewById(R.id.displayInfo);
        User currentUser = new User(named, placementLocation, time);
        textView.setText(currentUser.toString());
        textView.setVisibility(View.VISIBLE);
        postRef.setValue(currentUser);
        users.push().setValue(currentUser);

    }
}
