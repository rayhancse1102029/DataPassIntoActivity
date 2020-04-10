package com.example.datapassintoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView emailTV;
    private TextView nameTV;
    private TextView phoneTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String email = getIntent().getStringExtra("email");
        String name = getIntent().getStringExtra("name");
        String phone = getIntent().getStringExtra("phone");

        emailTV = (TextView) findViewById(R.id.emailTV);
        nameTV = (TextView) findViewById(R.id.nameTV);
        phoneTV = (TextView) findViewById(R.id.phoneTV);

        emailTV.setText(email);
        nameTV.setText(name);
        phoneTV.setText(phone);
    }
}
