package com.deveugene.securitysolution.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.deveugene.securitysolution.R;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class RegActivity extends AppCompatActivity {
    private EditText firstName, lastName, username, numberPhone, password, confirmPassword;
    private Button reg;
    private TextView loginLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        this.firstName = findViewById(R.id.reg_first_name);
        this.lastName = findViewById(R.id.reg_last_name);
        this.username = findViewById(R.id.reg_username);
        this.numberPhone = findViewById(R.id.reg_number_phone);
        this.password = findViewById(R.id.reg_password);
        this.confirmPassword = findViewById(R.id.reg_confirm_password);
        this.reg = findViewById(R.id.reg_reg_button);
        this.loginLink = findViewById(R.id.reg_login_button);
    }
}