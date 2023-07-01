package org.example.class4.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(0);

        assertEquals(5, problems.getMaxNumber(arrayList));

        arrayList = null;
        assertEquals(0, problems.getMaxNumber(arrayList));

        List<Integer> listWithOneElement = new ArrayList<>();
        listWithOneElement.add(5);
        assertEquals(5, problems.getMaxNumber(listWithOneElement));

        List<Integer> emptyList = new ArrayList<>();
        assertEquals(0, problems.getMaxNumber(emptyList));
    }


    @Test
    public void testShouldGetSumInArray() {
        int[] array = {0, 1, 2, 3};
        assertEquals(6, problems.getSum(array));

        array = null;
        assertEquals(0, problems.getSum(array));

        int[] arrayWithOneElement = {1};
        assertEquals(1, problems.getSum(arrayWithOneElement));

        int[] emptyArray = new int[0];
        assertEquals(0, problems.getSum(emptyArray));
    }

    @Test
    public void testShouldGetSumInArrayList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(6, problems.getSum(list));
    }

    @Test
    public void testShouldRemoveDuplicate() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(problems.removeDuplicates(list));
    }

}
