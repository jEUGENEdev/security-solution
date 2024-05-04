package com.deveugene.securitysolution.security;

public interface AuthResponse {
    int getCode();
    String getMessage();
    boolean isAuth();
    Roles getRole();
}
