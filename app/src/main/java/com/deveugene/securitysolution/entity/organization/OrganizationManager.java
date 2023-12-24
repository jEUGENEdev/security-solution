package com.deveugene.securitysolution.entity.organization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class OrganizationManager implements GetOrganizations {
    private final List<Organization> data = new ArrayList<>();

    public OrganizationManager() {
        this.data.add(new Organization("Предприятие общепита", "Россия, г. Краснодар, ул. Красная, д. 1"));
        this.data.add(new Organization("Мастерская", "Россия, г. Краснодар, ул. Красная, д. 115"));
        this.data.add(new Organization("Дом Культуры", "Россия, г. Краснодар, ул. Красная, д. 132"));
        this.data.add(new Organization("Театр", "Россия, г. Краснодар, ул. Красная, д. 134"));
        this.data.add(new Organization("Музей", "Россия, г. Краснодар, ул. Красная, д. 123"));
        this.data.add(new Organization("Парк", "Россия, г. Краснодар, ул. Красная, д. 643"));
        this.data.add(new Organization("Жилой дом", "Россия, г. Краснодар, ул. Красная, д. 125"));
        this.data.add(new Organization("Аптека", "Россия, г. Краснодар, ул. Красная, д. 432"));
        this.data.add(new Organization("Парикмахерская", "Россия, г. Краснодар, ул. Красная, д. 127"));
        this.data.add(new Organization("Магазин", "Россия, г. Краснодар, ул. Красная, д. 222"));
        this.data.add(new Organization("Торговый центр", "Россия, г. Краснодар, ул. Красная, д. 213"));
        this.data.add(new Organization("Рынок", "Россия, г. Краснодар, ул. Красная, д. 326"));
        this.data.add(new Organization("Цирк", "Россия, г. Краснодар, ул. Красная, д. 463"));
        this.data.add(new Organization("Магазин одежды", "Россия, г. Краснодар, ул. Красная, д. 236"));
        this.data.add(new Organization("Поликлиника", "Россия, г. Краснодар, ул. Красная, д. 641"));
        this.data.add(new Organization("Больница", "Россия, г. Краснодар, ул. Красная, д. 424"));
        this.data.add(new Organization("Санаторий", "Россия, г. Краснодар, ул. Красная, д. 462"));
        this.data.add(new Organization("Аквапарк", "Россия, г. Краснодар, ул. Красная, д. 656"));
        this.data.add(new Organization("Детский сад", "Россия, г. Краснодар, ул. Красная, д. 461"));
        this.data.add(new Organization("Школа", "Россия, г. Краснодар, ул. Красная, д. 235"));
        this.data.add(new Organization("Вуз", "Россия, г. Краснодар, ул. Красная, д. 354"));
        this.data.add(new Organization("Администрация", "Россия, г. Краснодар, ул. Красная, д. 453"));
        this.data.add(new Organization("Кинотеатр", "Россия, г. Краснодар, ул. Красная, д. 452"));
        this.data.add(new Organization("Здание МВД", "Россия, г. Краснодар, ул. Красная, д. 433"));
        this.data.add(new Organization("Бар", "Россия, г. Краснодар, ул. Красная, д. 343"));
        this.data.add(new Organization("Ресторан", "Россия, г. Краснодар, ул. Красная, д. 163"));
        this.data.add(new Organization("Кафе", "Россия, г. Краснодар, ул. Красная, д. 652"));
        this.data.add(new Organization("Ночной клуб", "Россия, г. Краснодар, ул. Красная, д. 386"));
        this.data.add(new Organization("Квесты", "Россия, г. Краснодар, ул. Красная, д. 379"));
        this.data.add(new Organization("Парковка", "Россия, г. Краснодар, ул. Красная, д. 328"));
    }

    @Override
    public Collection<Organization> getAll() {
        return this.data;
    }
}
