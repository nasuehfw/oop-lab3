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
 * Клас для верифікації та демонстрації базових прикладів теорії з методички
 * згідно з обов'язковим пунктом №2 технічного завдання.
 * 
 * @author Анастасія Горбунова
 * @version 3.0 14 Oct 2026
 */
public class TheoryExamples {

    /**
     * Запускає послідовне виконання всіх демонстраційних прикладів роботи
     * з типами даних, округленням та об'єктними посиланнями рядків.
     */
    public static void runAllExamples() {
        System.out.print("--- Перевірка теоретичних прикладів (Пункт 2 завдання) ---\n");

        // 1. Тестування цілочисельного ділення int та дробового double
        int quotientInt = 10 / 3;
        double quotientDouble = 10.0 / 3;
        System.out.print("1) Ділення чисел:\n");
        System.out.print("   - Результат int (10 / 3): " + quotientInt + "\n");
        System.out.print("   - Результат double (10.0 / 3): " + quotientDouble + "\n");

        // 2. Демонстрація похибки представлення дробових чисел у двійковій кучі
        double fractionA = 0.1;
        double fractionB = 0.2;
        System.out.print("2) Особливість двійкового представлення double (0.1 + 0.2):\n");
        System.out.print("   - Сума: " + (fractionA + fractionB) + "\n");

        // 3. Робота з методами класу String
        String text = "Java Programming";
        System.out.print("3) Інспекція методів об'єктного типу String (\"" + text + "\"):\n");
        System.out.print("   - Довжина рядка (.length()): " + text.length() + "\n");
        System.out.print("   - Верхній регістр (.toUpperCase()): " + text.toUpperCase() + "\n");
        System.out.print("   - Перший символ (.charAt(0)): " + text.charAt(0) + "\n");

        // 4. Порівняння об'єктних посилань (== проти .equals())
        String firstRef = new String("Java");
        String secondRef = new String("Java");
        System.out.print("4) Порівняння об'єктів рядків за посиланням та контентом:\n");
        System.out.print("   - Порівняння через оператор ==: " + (firstRef == secondRef) + "\n");
        System.out.print("   - Порівняння через метод .equals(): " + firstRef.equals(secondRef) + "\n");
        System.out.print("-----------------------------------------------------------\n\n");
    }
}
