package com.deveugene.securitysolution.security;

public final class SecurityManager implements Security {
    @Override
    public AuthResponse authenticate(Credentials credentials) {
        return new Response(credentials.getLogin(), credentials.getPassword());
    }
}
