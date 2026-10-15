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
 * Сервісний клас для управління масивом фільмів та виконання розрахунків.
 * Працює виключно зі структурами масивів без використання колекцій.
 */
public class MovieCatalog {
    /** Масив посилань на об'єкти базового типу Media */
    private final Media[] catalog;

    /**
     * Конструктор каталогу фільмів.
     * 
     * @param catalog масив об'єктів для аналізу
     */
    public MovieCatalog(Media[] catalog) {
        this.catalog = catalog;
    }

    /**
     * Виводить інформацію про всі фільми в каталозі.
     * Використовує поліморфний виклик методу printInfo().
     */
    public void printCatalog() {
        System.out.print("Повний список кінофільмів:\n");
        for (Media item : catalog) {
            if (item != null) {
                item.printInfo(); /* Поліморфне виконання для фактичного класу об'єкта */
            }
        }
    }

    /**
     * Знаходить фільм із найвищим рейтингом та виводить його характеристики.
     * Реалізує лінійний алгоритм пошуку максимуму в масиві об'єктів.
     */
    public void findHighestRatedMovie() {
        if (catalog == null || catalog.length == 0) {
            System.out.print("[ПОМИЛКА] Каталог порожній або не ініціалізований!\n");
            return;
        }

        Movie highestRated = null; /* Посилання на об'єкт найкращого фільму */
        double maxRating = -1.0;   /* Локальна змінна для фіксації максимуму */

        for (Media item : catalog) {
            // Перевіряємо, чи об'єкт за посиланням є екземпляром класу Movie
            if (item instanceof Movie) {
                Movie currentMovie = (Movie) item; /* Явне приведення типів даних */
                
                if (currentMovie.getRating() > maxRating) {
                    maxRating = currentMovie.getRating();
                    highestRated = currentMovie;
                }
            }
        }

        /* Виведення знайденого лідера рейтингу */
        if (highestRated != null) {
            System.out.print("\nФільм із найвищим рейтингом:\n  --> ");
            highestRated.printInfo();
        }
    }
}
