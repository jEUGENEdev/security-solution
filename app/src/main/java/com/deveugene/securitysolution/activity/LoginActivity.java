package com.deveugene.securitysolution.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.deveugene.securitysolution.R;
import com.deveugene.securitysolution.security.AuthResponse;
import com.deveugene.securitysolution.security.SecurityManager;
import com.deveugene.securitysolution.security.UserData;
import com.deveugene.securitysolution.storage.Keys;
import com.deveugene.securitysolution.storage.LocalStorage;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class LoginActivity extends AppCompatActivity {
    @Inject
    public LocalStorage localStorage;

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

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (localStorage.getBoolean(Keys.IS_AUTH.name(), false)) {
            startActivity(new Intent(this, HomeActivity.class));
            finish();
        }
    }

    public void clickRegButton(View view) {
        startActivity(new Intent(this, RegActivity.class));
    }

    public void clickLoginButton(View view) {
        SecurityManager security = new SecurityManager();
        UserData data = new UserData(username.getText().toString(), password.getText().toString());
        AuthResponse authResponse = security.authenticate(data);
        if (authResponse.isAuth()) {
            localStorage.putBoolean(Keys.IS_AUTH.name(), true);
            startActivity(new Intent(this, HomeActivity.class));
            finish();
        } else {
            new AlertDialog.Builder(this)
                    .setMessage(authResponse.getMessage())
                    .show();
        }
    }

    public void clickResetPassword(View view) {
        new AlertDialog.Builder(this)
                .setMessage("Функционал пока не доступен :(")
                .create()
                .show();
    }
}