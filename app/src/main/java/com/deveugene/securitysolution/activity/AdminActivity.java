package com.deveugene.securitysolution.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.deveugene.securitysolution.R;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        findViewById(R.id.loginSystem).setOnClickListener(v -> {
            startActivity(new Intent(this, HomeActivity.class));
        });
    }
}