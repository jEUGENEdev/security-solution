package com.deveugene.securitysolution.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.deveugene.securitysolution.R;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HomeActivity extends AppCompatActivity {
    private ImageView profileAvatar;
    private TextView homeGreeting;
    private EditText homeSearch;
    private ImageButton profileSettings;
    private RecyclerView homeItems;
    private LinearLayout navHome, navOrgNew, navNotification, navLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        this.profileAvatar = findViewById(R.id.profileAvatar);
        this.homeGreeting = findViewById(R.id.homeGreeting);
        this.homeSearch = findViewById(R.id.homeSearch);
        this.profileSettings = findViewById(R.id.profileSettings);
        this.homeItems = findViewById(R.id.homeItems);
        this.navHome = findViewById(R.id.homeHome);
        this.navOrgNew = findViewById(R.id.homeOrgNew);
        this.navNotification = findViewById(R.id.homeNotifications);
        this.navLogout = findViewById(R.id.homeLogout);
    }
}