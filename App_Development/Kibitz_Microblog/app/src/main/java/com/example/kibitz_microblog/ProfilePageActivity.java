package com.example.kibitz_microblog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfilePageActivity extends AppCompatActivity {

    ImageButton SC, Share1, Share2, Share3;
    ImageButton comm1, comm2, comm3, com1, com2, com3;
    TextView Profilepic;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        SC = (ImageButton)findViewById(R.id.imageView_5pp);
        Share1 = (ImageButton)findViewById(R.id.share_to1);
        Share2 = (ImageButton)findViewById(R.id.share_to2);
        Share3 = (ImageButton)findViewById(R.id.share_to3);
        comm1 = (ImageButton)findViewById(R.id.view_comments1);
        comm2 = (ImageButton)findViewById(R.id.view_comments2);
        comm3 = (ImageButton)findViewById(R.id.view_comments3);
        com1 = (ImageButton)findViewById(R.id.com_id1);
        com2 = (ImageButton)findViewById(R.id.com_id2);
        com3 = (ImageButton)findViewById(R.id.com_id3);
        Profilepic = (TextView)findViewById(R.id.profile_pic);

        SC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProfilePageActivity.this, SettingsActivity.class );
                startActivity(intent1);
            }
        });

        comm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProfilePageActivity.this, CommentsActivity.class);
                startActivity(intent1);
            }
        });

        comm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProfilePageActivity.this, CommentsActivity.class);
                startActivity(intent1);
            }
        });

        comm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProfilePageActivity.this, CommentsActivity.class);
                startActivity(intent1);
            }
        });

        com1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog();
                dialog.show(getSupportFragmentManager(),"dialog");
            }
        });

        com2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog();
                dialog.show(getSupportFragmentManager(),"dialog");
            }
        });

        com3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog();
                dialog.show(getSupportFragmentManager(),"dialog");
            }
        });

        Share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProfilePageActivity.this, ShareActivity.class);
                startActivity(intent1);
            }
        });

        Share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProfilePageActivity.this, ShareActivity.class);
                startActivity(intent1);
            }
        });

        Share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProfilePageActivity.this, ShareActivity.class);
                startActivity(intent1);
            }
        });

        Profilepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProfilePageActivity.this, PostingActivity.class);
                startActivity(intent1);
            }
        });
    }
}
