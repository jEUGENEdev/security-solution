package com.deveugene.securitysolution.storage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.util.Objects;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.qualifiers.ApplicationContext;

@AndroidEntryPoint
public class LocalStorage extends Service {
    private final String NAME = "APP_STORAGE";
    private final SharedPreferences preferences;

    @Inject
    public LocalStorage(@ApplicationContext Context context) {
        this.preferences = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
    }

    public String getString(String key) {
        return Objects.requireNonNull(this.preferences.getString(key, null));
    }

    public int getInt(String key) {
        int r = this.preferences.getInt(key, Integer.MIN_VALUE);
        if (r == Integer.MIN_VALUE) {
            throw new RuntimeException("Not Found");
        }

        return r;
    }

    public boolean getBoolean(String key, boolean def) {
        return this.preferences.getBoolean(key, def);
    }

    public void putBoolean(String key, boolean value) {
        this.preferences.edit()
                .putBoolean(key, value)
                .apply();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
