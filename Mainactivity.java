package com.example.simple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnlogin;

    String correct_username = "admin";
    String correct_password= "sravya";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnlogin = findViewById(R.id.button);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString()))
                    ;
                Toast.makeText(MainActivity.this, "Empty data provided", Toast.LENGTH_LONG).show();
            }



        });
    }
}
