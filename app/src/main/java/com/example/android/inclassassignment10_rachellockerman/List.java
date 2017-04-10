package com.example.android.inclassassignment10_rachellockerman;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class List extends AppCompatActivity {
    TextView display;
    FirebaseDatabase database;
    DatabaseReference postRef;
    DatabaseReference users;
    ArrayList<User> userArrayList;
    String TAG = "List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        database = FirebaseDatabase.getInstance();
        users = database.getReference("users");
        userArrayList= new ArrayList<>();
        display = (TextView) findViewById(R.id.displayUsers);

        users.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                User user = dataSnapshot.getValue(User.class);
                userArrayList.add(user);

                String results = "";
                for (User u : userArrayList){
                    results+=u+"\n"+"\n";
                }
                display.setVisibility(View.VISIBLE);
                display.setText(results);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



    }
}
