package com.deveugene.securitysolution.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Response implements AuthResponse {
    private static final Map<String, List<String>> tmpUserData = new HashMap<>();

    static {
        List<String> data = new ArrayList<>();
        data.add("123");
        data.add("USER");
        tmpUserData.put("zhenya", data);
        data = new ArrayList<>();
        data.add("123");
        data.add("USER");
        tmpUserData.put("admin", data);
    }

    private final String login, password;
    private final boolean isAuth;
    private Roles role;

    public Response(String login, String password) {
        this.login = login;
        this.password = password;
        this.isAuth = checkAuth(login, password);
    }

    private boolean checkAuth(String login, String password) {
        if (tmpUserData.containsKey(login)) {
            List<String> data = tmpUserData.get(login);
            if (data.get(0).equals(password)) {
                this.role = Roles.valueOf(data.get(1));
                return true;
            }
        }

        return false;
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

    @Override
    public Roles getRole() {
        return this.role;
    }
}
