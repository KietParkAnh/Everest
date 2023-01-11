package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login, signup;
    EditText name,password;
    TextView username,pass;
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.loginId);
        signup = (Button) findViewById(R.id.submit);
        name = (EditText) findViewById(R.id.regNameText);
        password = (EditText) findViewById(R.id.regPassText);
        username = (TextView) findViewById(R.id.regNameId);
        pass = (TextView) findViewById(R.id.regPassId);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("admin")&&
                password.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Redirecting...", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Wrong Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Signup.class);
                startActivity(i);
            }
        });
    }
}