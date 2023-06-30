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

    public int getMaxNumber(List<Integer> arrayList) {
        int max = arrayList.get(0);

        int i;
        for (i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        return max;
    }

    public int getSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + array[i];
        }
        return sum;
    }

    public int getSum(List<Integer> arrayList) {
        int sum = 0;
        int i;
        for (i = 0; i < arrayList.size(); i++) {
            sum = sum + arrayList.get(i);
        }
        return sum;
    }

    public List<Integer> removeDuplicates(List<Integer> arrayList) {
        return null;
        //int uniqArray = ArrayList.from(new Set(arrayList));
        // }
    }

    ;


    public HashMap<Integer, Integer> findMostFrequentItem(List<Integer> arraylist) {
        int max = arraylist.get(0);

        for (Integer i : arraylist) {
            Integer value = arraylist.get(i);
            if (value == null) {
                arraylist.put(i, 1);
            } else {
                arraylist.put(i, ++value);
            }

        }

        for (int i : arraylist) {
            if (arraylist.get(i) > max) {
                max = arraylist.get(i);
                return i;
            }

        }
        return max;
    }
