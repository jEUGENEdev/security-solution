package com.deveugene.securitysolution.security;

public class Response implements AuthResponse {
    private final String login, password;
    private final boolean isAuth;

    public Response(String login, String password) {
        this.login = login;
        this.password = password;
        this.isAuth = "zhenya".equals(this.login) && "123".equals(this.password);
    }

    @Override
    public int getCode() {
        return this.isAuth ? 200 : 403;
    }

    @Override
    public String getMessage() {
        return this.isAuth ? "Аутентификация успешна" : "Ошибка аутентификации: Неправильные логин или пароль";
    }

    @Override
    public boolean isAuth() {
        return this.isAuth;
    }
}
