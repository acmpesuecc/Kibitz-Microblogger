package com.example.kibitz_microblog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CommentsActivity extends AppCompatActivity {
    TextView User1, User2, User3, User4, User5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments_page);

        User1 = (TextView)findViewById(R.id.username1);
        User2 = (TextView)findViewById(R.id.username2);
        User3 = (TextView)findViewById(R.id.username3);
        User4 = (TextView)findViewById(R.id.username4);
        User5 = (TextView)findViewById(R.id.username5);
        View reply1=(View)findViewById(R.id.reply1);
        View reply2=(View)findViewById(R.id.reply2);
        View reply3=(View)findViewById(R.id.reply3);
        View reply4=(View)findViewById(R.id.reply4);
        View reply5=(View)findViewById(R.id.reply5);

        reply1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog();
                dialog.show(getSupportFragmentManager(),"dialog");
            }
        });

        reply2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog();
                dialog.show(getSupportFragmentManager(),"dialog");
            }
        });

        reply3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog();
                dialog.show(getSupportFragmentManager(),"dialog");
            }
        });

        reply4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog();
                dialog.show(getSupportFragmentManager(),"dialog");
            }
        });

        reply5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog();
                dialog.show(getSupportFragmentManager(),"dialog");
            }
        });

        User1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(CommentsActivity.this, PublicProfileActivity.class);
                startActivity(intent1);
            }
        });

        User2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(CommentsActivity.this, PublicProfileActivity.class);
                startActivity(intent1);
            }
        });

        User3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(CommentsActivity.this, PublicProfileActivity.class);
                startActivity(intent1);
            }
        });

        User4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(CommentsActivity.this, PublicProfileActivity.class);
                startActivity(intent1);
            }
        });

        User5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(CommentsActivity.this, PublicProfileActivity.class);
                startActivity(intent1);
            }
        });
    }


}


