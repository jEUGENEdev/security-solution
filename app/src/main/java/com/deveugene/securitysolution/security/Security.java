package com.deveugene.securitysolution.security;

public interface Security {
    AuthResponse authenticate(Credentials credentials);
}
