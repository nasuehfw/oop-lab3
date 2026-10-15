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
 * Дочірній клас, що описує сутність "Фільм".
 * Наслідує базовий клас Media за допомогою ключового слова extends.
 */
public class Movie extends Media {
    /** Жанр фільму (об'єктний тип String) */
    private final String genre;
    /** Рік випуску фільму (примітивний тип int) */
    private final int year;
    /** Тривалість у хвилинах (примітивний тип int) */
    private final int duration;
    /** Рейтинг фільму від 0.0 до 10.0 (примітивний тип double) */
    private final double rating;

    /**
     * Конструктор класу Movie. Викликає конструктор суперкласу через super.
     * 
     * @param title назва фільму
     * @param genre жанр кінострічки
     * @param year рік виходу на екрани
     * @param duration хронометраж у хвилинах
     * @param rating оцінка критиків або глядачів
     */
    public Movie(String title, String genre, int year, int duration, double rating) {
        super(title); /* Виклик конструктора батьківського класу Person/Media */
        this.genre = genre;
        this.year = year;
        this.duration = duration;
        this.rating = rating;
    }

    /**
     * Переозначений метод виведення інформації про фільм.
     * Демонструє динамічний об'єктний поліморфізм та контроль сигнатури.
     */
    @Override
    public void printInfo() {
        System.out.printf("Фільм: %-25s | Жанр: %-10s | Рік: %d | Тривалість: %3d хв | Рейтинг: %.1f\n", 
                title, genre, year, duration, rating);
    }

    // --- Геттери для доступу до інкапсульованих даних ---
    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }
}
