package com.deveugene.securitysolution.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.deveugene.securitysolution.R;
import com.deveugene.securitysolution.adapter.HomeItemsAdapter;
import com.deveugene.securitysolution.entity.ItemEntity;
import com.deveugene.securitysolution.entity.notification.NotificationManager;
import com.deveugene.securitysolution.entity.organization.OrganizationManager;
import com.deveugene.securitysolution.storage.Keys;
import com.deveugene.securitysolution.storage.LocalStorage;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HomeActivity extends AppCompatActivity {
    @Inject
    public LocalStorage localStorage;

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

    @Override
    protected void onStart() {
        super.onStart();
        clickNavHomeButton(this.navHome);
    }

    public void clickProfileSettingsButton(View view) {
        startActivity(new Intent(this, ProfileActivity.class));
    }

    public void clickNavHomeButton(View view) {
        OrganizationManager manager = new OrganizationManager();
        HomeItemsAdapter.ofDefault((List<? extends ItemEntity>) manager.getAll(), this.homeItems);
    }

    public void clickNavNewOrgButton(View view) {
        startActivity(new Intent(this, ObjectActivity.class));
    }

    public void clickNavNotificationsButton(View view) {
        NotificationManager manager = new NotificationManager();
        HomeItemsAdapter.ofDefault((List<? extends ItemEntity>) manager.getAll(), this.homeItems);
    }

    public void clickNavLogoutButton(View view) {
        localStorage.putBoolean(Keys.IS_AUTH.name(), false);
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}