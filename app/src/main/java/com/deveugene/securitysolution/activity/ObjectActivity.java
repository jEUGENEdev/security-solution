package com.deveugene.securitysolution.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

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
}