package com.example.datapassintoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private EditText emailET;
private EditText nameET;
private EditText phoneET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailET = findViewById(R.id.emailET);
        nameET = (EditText) findViewById(R.id.nameET);
        phoneET = (EditText) findViewById(R.id.phoneET);
    }

    public void submitBtnFun(View view) {

        String email = emailET.getText().toString();
        String name = nameET.getText().toString();
        String phone = phoneET.getText().toString();

        Intent intent =  new Intent(MainActivity.this, SecondActivity.class);

        intent.putExtra("email", email);
        intent.putExtra("name", name);
        intent.putExtra("phone", phone);

        startActivity(intent);

        }
}
