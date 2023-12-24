package com.deveugene.securitysolution.entity.notification;

import com.deveugene.securitysolution.entity.ItemEntity;

public class Notification implements ItemEntity {
    private final String title;

    public Notification(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getSubTitle() {
        return this.title;
    }
}
