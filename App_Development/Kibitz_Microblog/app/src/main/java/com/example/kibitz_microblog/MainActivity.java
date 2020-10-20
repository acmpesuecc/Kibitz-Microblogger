package com.example.kibitz_microblog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    EditText kibitzID, password;
    ImageButton login, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kibitzID = (EditText)findViewById(R.id.kibitz_id);
        password = (EditText)findViewById(R.id.password_id);
        login = (ImageButton)findViewById(R.id.login_id);
        signup = (ImageButton)findViewById(R.id.signin_id);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Signup = new Intent(MainActivity.this, HomePage.class );
                startActivity(Signup);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Signup = new Intent(MainActivity.this, SignupActivity.class );
                startActivity(Signup);
            }
        });
    }
}