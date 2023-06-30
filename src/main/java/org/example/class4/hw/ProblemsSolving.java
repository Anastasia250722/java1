package org.example.class4.hw;

import java.util.List;

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
        for (i = 0; i < arrayList.get(i); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        return max;
    }

    public int getSum(int[] array) {
        return 0;
    }

    public int getSum(List<Integer> list) {
        return 0;
    }

    public List<Integer> removeDuplicates(List<Integer> list) {
        return null;
    }

    public int findMostFrequentItem(List<Integer> list) {
        return 0;
    }
}
