package com.example.homework1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText first;
    private EditText second;
    private EditText three;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        three = findViewById(R.id.three);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(view -> {
            String gmail = first.getText().toString();
            String tema = second.getText().toString();
            String message = second.getText().toString();
            Intent email = new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_EMAIL, new String[]{ gmail});
            email.putExtra(Intent.EXTRA_SUBJECT, tema);
            email.putExtra(Intent.EXTRA_TEXT, message);
            email.setType("message/rfc822");
            startActivity(email);

        });

    }

}