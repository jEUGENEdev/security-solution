package com.deveugene.securitysolution.security;

public final class UserData implements Credentials {
    private final String username, password;

    public UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getLogin() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}
