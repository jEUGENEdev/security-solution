package com.deveugene.securitysolution.activity;

import static android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

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

    public void clickProfileCancelButton(View view) {
        finish();
    }

    public void clickAvatar(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, 1);
    }

    public void clickSaveButton(View view) {
        finish();
        Toast.makeText(this, "Изменения были сохранены!", Toast.LENGTH_LONG).show();
    }
}