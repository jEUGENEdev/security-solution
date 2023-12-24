package com.deveugene.securitysolution.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.deveugene.securitysolution.R;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class LoginActivity extends AppCompatActivity {
    private EditText username, password;
    private Button login, reg;
    private TextView resetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.username = findViewById(R.id.login_username);
        this.password = findViewById(R.id.login_password);
        this.login = findViewById(R.id.login_button);
        this.reg = findViewById(R.id.login_button_reg);
        this.resetPassword = findViewById(R.id.login_reset_password);
    }
}