package com.deveugene.securitysolution.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.deveugene.securitysolution.R;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ProfileActivity extends AppCompatActivity {
    private Button cancel, save;
    private ImageView avatar;
    private EditText fullname, phone, password, confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        this.cancel = findViewById(R.id.profileCancel);
        this.save = findViewById(R.id.profileSaveChanges);
        this.avatar = findViewById(R.id.profileMainAvatar);
        this.fullname = findViewById(R.id.profileFullname);
        this.phone = findViewById(R.id.profilePhone);
        this.password = findViewById(R.id.profilePassword);
        this.confirmPassword = findViewById(R.id.profilePasswordConfirm);
    }
}