package com.example.firstpracticedesign;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
 Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signup=findViewById(R.id.button_start);
        signup.setOnClickListener(view -> {
            Intent i= new Intent(SignUp.this,login.class);
            startActivity(i);

//                finish();
        });
    }
}