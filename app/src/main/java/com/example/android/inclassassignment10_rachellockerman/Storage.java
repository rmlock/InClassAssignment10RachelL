package com.example.android.inclassassignment10_rachellockerman;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class Storage extends AppCompatActivity {
    FirebaseStorage storage = FirebaseStorage.getInstance();
    StorageReference storageRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);
        storageRef = storage.getReference();



    }

    public void downloadFile(View view) {

        // Create a storage reference from our app

// Create a reference to "mountains.jpg"
        StorageReference pictures = storageRef.child("picture.jpg");

// Create a reference to 'images/mountains.jpg'
        StorageReference pictureRef = storageRef.child("images/picture.jpg");

// While the file names are the same, the references point to different files
        pictures.getName().equals(pictureRef.getName());    // true
        pictures.getPath().equals(pictureRef.getPath());    // false
    }

    private void uploadFile(View view) {


//        imageFile.putFile(file)
//                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
//                    @Override
//                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//                        // Get a URL to the uploaded content
//                        Uri downloadUrl = taskSnapshot.getDownloadUrl();
//                        Toast.makeText(Storage.this, "File Uploaded! "+ downloadUrl, Toast.LENGTH_SHORT).show();
//                    }
//                })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception exception) {
//                        // Handle unsuccessful uploads
//                        // ...
//                    }
//                });
//
//
    }
}
