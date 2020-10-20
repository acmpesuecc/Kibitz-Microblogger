package com.example.kibitz_microblog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    TextView User1, User2, User3;
    ImageButton Settings, Signout, Post_img;
    TextView User_1, User_2, User_3, User_4, User_5;
    ImageButton comm1, comm2, comm3, com1, com2, com3;
    ImageButton Share1, Share2, Share3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        User1 = (TextView)findViewById(R.id.user_name_1);
        User2 = (TextView)findViewById(R.id.user_name_2);
        User3 = (TextView)findViewById(R.id.user_name_3);
        Settings = (ImageButton)findViewById(R.id.settings_btn);
        Signout = (ImageButton)findViewById(R.id.signout_btn);
        User_1 = (TextView)findViewById(R.id.user1);
        User_2 = (TextView)findViewById(R.id.user2);
        User_3 = (TextView)findViewById(R.id.user3);
        User_4 = (TextView)findViewById(R.id.user4);
        User_5 = (TextView)findViewById(R.id.user5);
        Post_img = (ImageButton)findViewById(R.id.post_img);
        comm1 = (ImageButton)findViewById(R.id.view_comments1);
        comm2 = (ImageButton)findViewById(R.id.view_comments2);
        comm3 = (ImageButton)findViewById(R.id.view_comments3);
        com1 = (ImageButton)findViewById(R.id.com_id1);
        com2 = (ImageButton)findViewById(R.id.com_id2);
        com3 = (ImageButton)findViewById(R.id.com_id3);
        Share1 = (ImageButton)findViewById(R.id.share_to1);
        Share2 = (ImageButton)findViewById(R.id.share_to2);
        Share3 = (ImageButton)findViewById(R.id.share_to3);

        User1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, PublicProfileActivity.class );
                startActivity(intent1);
            }
        });

        User2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, PublicProfileActivity.class );
                startActivity(intent1);
            }
        });

        User3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, PublicProfileActivity.class );
                startActivity(intent1);
            }
        });

        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, SettingsActivity.class );
                startActivity(intent1);
            }
        });

        Signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        User_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, ChatForumActivity.class);
                startActivity(intent1);
            }
        });

        User_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, ChatForumActivity.class);
                startActivity(intent1);
            }
        });

        User_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, ChatForumActivity.class);
                startActivity(intent1);
            }
        });

        User_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, ChatForumActivity.class);
                startActivity(intent1);
            }
        });

        User_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, ChatForumActivity.class);
                startActivity(intent1);
            }
        });

        Post_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, PostingActivity.class);
                startActivity(intent1);
            }
        });

        comm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, CommentsActivity.class);
                startActivity(intent1);
            }
        });

        comm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, CommentsActivity.class);
                startActivity(intent1);
            }
        });

        comm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, CommentsActivity.class);
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
                Intent intent1 = new Intent(HomePage.this, ShareActivity.class);
                startActivity(intent1);
            }
        });

        Share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, ShareActivity.class);
                startActivity(intent1);
            }
        });

        Share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, ShareActivity.class);
                startActivity(intent1);
            }
        });



    }
}
