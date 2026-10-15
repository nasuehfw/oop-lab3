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

public class Main {
    public static void main(String[] args) {
        System.out.print("=== Лабораторна робота №3 ===\n\n");
        System.out.print("Тема: Особливості використання змінних і типів даних у Java\n\n");

        // Виклик виконання прикладів пункта №2 із завдання.
        TheoryExamples.runAllExamples();

        // Виклик виконання індивідуального завдання. Вариант №7 (Облік фільмів).
        System.out.print("--- Виконання індивідуального завдання (Варіант №7) ---\n");
        Media[] movies = {
            new Movie("Початок (Inception)", "Фантастика", 2010, 148, 8.8),
            new Movie("Інтерстеллар", "Драма", 2014, 169, 8.7),
            new Movie("Темний лицар", "Екшн", 2008, 152, 9.0),
            new Movie("Матриця", "Фантастика", 1999, 136, 8.7),
            new Movie("Кримінальне чтиво", "Кримінал", 1994, 154, 8.9)
        };

        MovieCatalog catalog = new MovieCatalog(movies);
        catalog.printCatalog();
        catalog.findHighestRatedMovie();
    }
}

