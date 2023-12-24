package com.deveugene.securitysolution.entity;

public class Organization implements ItemEntity {
    private final String title, address;

    public Organization(String title, String address) {
        this.title = title;
        this.address = address;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getSubTitle() {
        return this.address;
    }
}
