package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Signup extends AppCompatActivity {

    Button submit, back;
    EditText regName, regPass;
    TextView name, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        submit = (Button) findViewById(R.id.submit);
        back = (Button) findViewById(R.id.backBtn);
        regName = (EditText) findViewById(R.id.regNameText);
        regPass = (EditText) findViewById(R.id.regPassText);
        name = (TextView) findViewById(R.id.regNameId);
        pass = (TextView) findViewById(R.id.regPassId);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Signup.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Signup.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}