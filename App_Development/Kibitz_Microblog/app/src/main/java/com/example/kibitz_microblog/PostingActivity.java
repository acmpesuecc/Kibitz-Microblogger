package com.example.kibitz_microblog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PostingActivity extends AppCompatActivity {

    ImageButton Img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_addition);

        Img = (ImageButton)findViewById(R.id.img_addn);

        Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(PostingActivity.this, HomePage.class);
                startActivity(intent1);
            }
        });
    }
}
