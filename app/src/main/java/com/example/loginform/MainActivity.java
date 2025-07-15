package com.example.loginform;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view) {
        TextInputLayout usernameInput = findViewById(R.id.usernameText);
        String username = String.valueOf(usernameInput.getEditText().getText());

        TextInputLayout passwordInput = findViewById(R.id.passwordText);
        String password = String.valueOf(passwordInput.getEditText().getText());
        if (username.equals("admin") && password.equals("admin")) {
            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_LONG).show();
        }
    }
}

