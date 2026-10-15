/*
 * Copyright (c) 2026. Anastasiia Gorbunova
 * National University "Odesa Polytechnic"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://apache.org
 */
package ad251.gorbunova;

/**
 * Базовий клас, що описує абстрактну медіа-продукцію.
 * Демонструє основи наслідування та створення суперкласів.
 * 
 * @author Анастасія Горбунова
 * @version 3.0 14 Oct 2026
 */
public class Media {
    /** Назва медіа-файлу або витвору (об'єктний тип String) */
    protected String title;

    /**
     * Конструктор базового класу.
     * 
     * @param title назва витвору
     */
    public Media(String title) {
        this.title = title;
    }

    /**
     * Базовий метод представлення об'єкта.
     */
    public void printInfo() {
        System.out.print("Медіа-твір: " + title + "\n");
    }

    // --- Геттери та Сеттери згідно з конвенцією коду ---
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
