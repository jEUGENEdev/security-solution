package com.deveugene.securitysolution.entity.notification;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class NotificationManager implements GetNotifications {
    private final List<Notification> data = new ArrayList<>();

    public NotificationManager() {
        this.data.add(new Notification("На территорию проник вор."));
        this.data.add(new Notification("Охранник Алексей поднял тревогу."));
        this.data.add(new Notification("На объекте не закрыты двери."));
        this.data.add(new Notification("В 14:58 не работала камера на объекте."));
        this.data.add(new Notification("На объект был вызван наряд полиции."));
        this.data.add(new Notification("На объекте не установлены камеры."));
        this.data.add(new Notification("Охранник не вышел на смену."));
        this.data.add(new Notification("Отсутствует сервер камер видеонаблюдения."));
    }

    @Override
    public Collection<Notification> getAll() {
        return this.data;
    }
}
