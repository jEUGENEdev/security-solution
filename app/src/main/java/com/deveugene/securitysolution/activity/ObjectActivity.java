package com.deveugene.securitysolution.activity;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.deveugene.securitysolution.R;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ObjectActivity extends AppCompatActivity {
    private ImageButton cancel;
    private TextView title;
    private EditText objectTitle, objectAddress, camsHostAddress;
    private Button save, cams;

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
        this.cams = findViewById(R.id.objectCamsWatch);
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

    public void clickWatchCamsButton(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_cams);

        VideoView video1 = dialog.findViewById(R.id.sampleVideo1);
        video1.setSoundEffectsEnabled(false);
        video1.setVideoURI(Uri.parse(String.format("android.resource://%s/%s", getPackageName(), R.raw.sample_video3)));
        VideoView video2 = dialog.findViewById(R.id.sampleVideo2);
        video2.setSoundEffectsEnabled(false);
        video2.setVideoURI(Uri.parse(String.format("android.resource://%s/%s", getPackageName(), R.raw.sample_video1)));
        VideoView video3 = dialog.findViewById(R.id.sampleVideo3);
        video3.setSoundEffectsEnabled(false);
        video3.setVideoURI(Uri.parse(String.format("android.resource://%s/%s", getPackageName(), R.raw.sample_video2)));

        dialog.show();

        video1.start();
        video2.start();
        video3.start();
    }
}