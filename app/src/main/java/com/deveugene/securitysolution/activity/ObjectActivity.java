package com.deveugene.securitysolution.activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.deveugene.securitysolution.R;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ObjectActivity extends AppCompatActivity {
    private ImageButton cancel;
    private TextView title;
    private EditText objectTitle, objectAddress, camsHostAddress;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object);

        this.cancel = findViewById(R.id.objectCancel);
        this.title = findViewById(R.id.objectTitle);
        this.objectTitle = findViewById(R.id.inputObjectTitle);
        this.objectAddress = findViewById(R.id.objectAddress);
        this.camsHostAddress = findViewById(R.id.objectCamsHostAddress);
        this.save = findViewById(R.id.objectSave);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        this.objectTitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ObjectActivity.this.inputObjectTitle(ObjectActivity.this.objectTitle, s.toString());
            }
        });
    }

    private void inputObjectTitle(View view, String text) {
        this.title.setText(text);
    }

    public void clickCancelButton(View view) {
        finish();
    }

    public void clickSaveButton(View view) {
        finish();
        Toast.makeText(this, "Заявка на добавление объекта была отправлена!", Toast.LENGTH_LONG).show();
    }
}