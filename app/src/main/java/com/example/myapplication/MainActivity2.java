package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText Title;
    Button sendBtn;
    EditText Mess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Title=findViewById(R.id.Title);
        sendBtn=findViewById(R.id.sendBtn);
        Mess=findViewById(R.id.Mess);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail(Title.getText().toString(),Mess.getText().toString(),"bsef20a503@pucit.edu.pk");
            }
        });
    }
    public void sendEmail(String subject,String Mess_ege,String Rec )
    {

        Intent email= new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL,Rec);
        email.putExtra(Intent.EXTRA_SUBJECT, subject);
        email.putExtra(Intent.EXTRA_TEXT,Mess_ege);

        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email,"Choose Email Address :"));

    }


    }
