package org.example.class5.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * <h2>Задача 5: «Анаграмма»</h2>
 * <p>Два слова называют анаграммами, если они состоят из одних и тех же букв.</p>
 * <p>Напишите функцию, проверяющую, являются ли две строки анаграммами друг друга
 * (регистр букв не имеет значения). Для простоты примите, что в этих строках
 * нет пробелов и знаков препинания.</p>
 */
public class EAnagram {

    /**
     * <p>Идея - отсортировать две строки, а потом их сравнить.</p>
     * <p>Скорее всего отсортировать строку не получится. Нужно будет преобразовать ее к массиву.</p>
     * <p>Отсортировать полученный массив.</p>
     * <p>Преобразовать полученный массив к строке</p>
     * <p>Повторить тоже самое для второй строки</p>
     * <p>Сравнить полученные строки</p>
     *
     *
     */
    public static boolean isAnagram(String str1, String str2) {

        return false;
    }


    @Test
    public void test() {
        assertTrue(isAnagram("finder", "Friend"));
        assertTrue(isAnagram("up", "UP"));
        assertFalse(isAnagram("hello", "bye"));
        assertFalse(isAnagram("aba", "ba"));
        assertFalse(isAnagram("up", "down"));
    }

}
