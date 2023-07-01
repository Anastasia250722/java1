package org.example.class4.hw;

import java.util.*;

public class ProblemsSolving implements Problems {


    public int getMaxNumber(int[] array) {
        // подумать, что делать, если придет пустой массив
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public int getMaxNumber(List<Integer> list) {
        if (list == null || list.isEmpty()) return 0;
        if (list.size() == 1) return list.get(0);

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public int getSum(int[] array) {
        if (array == null) return 0;

        int sum = 0;
        for (int item : array) {
            sum += item;            // sum = sum + item
        }
        return sum;
    }

    public int getSum(List<Integer> list) {
        if (list == null) return 0;

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public List<Integer> removeDuplicates(List<Integer> list) {

        Set<Integer> set= new HashSet<>(list);
        List<Integer> newArrayList = new ArrayList<>(set);
        return newArrayList;
    }

    public int findMostFrequentItem(List<Integer> arraylist) {
        return 0;
    }
}
