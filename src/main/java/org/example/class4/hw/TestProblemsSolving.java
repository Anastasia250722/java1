package org.example.class4.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblemsSolving {

    private Problems problems;

    @BeforeEach
    public void setup() {
        problems = new ProblemsSolving();
    }

    @Test
    public void testShouldGetMaxNumberInArray() {
        int[] arr1 = {12, 10, 11, 0};
        int actual1 = problems.getMaxNumber(arr1);
        assertEquals(12, actual1);

        int[] arr2 = {1, 1, 5, 5, 5, 2};
        assertEquals(5, problems.getMaxNumber(arr2));


//        int [] arr3 = new int[0];
//        int actual3 = problems.getMaxNumber(arr3);
    }

    @Test
    public void testShouldGetMaxNumberInArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(0);

        assertEquals(5, problems.getMaxNumber(arrayList));

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        if (arrayList1.isEmpty()) {
            System.out.println("array is empty");
        }
        //assertEquals(0, problems.getMaxNumber(arrayList1));
    }


    @Test
    public int testShouldGetSumInArray() {
        int[] array = {0, 1, 2, 3};
        int sumFromArray = problems.getSum(array);
        System.out.println(sumFromArray);
        return sumFromArray;
    }
    @Test
    public int testShouldGetSumInArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        int sumFromArrayList = problems.getSum(arrayList);
        System.out.println(sumFromArrayList);
        return sumFromArrayList;
    }

    @Test
    public int testFindMostFrequentItem() {
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(1, 10);
        map.put(2, 11);
        map.put(3, 11);


    }
}

