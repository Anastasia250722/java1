package org.example.class4.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblemsSolving {

    private Problems problems;

    @BeforeEach
    public void setup() {
        problems = new ProblemsSolving();
    }

    @Test
    public void testShouldGetMaxNumberInArray() {
        int [] arr1 = {12, 10, 11, 0};
        int actual1 = problems.getMaxNumber(arr1);
        assertEquals(12, actual1);

        int [] arr2 = {1,1, 5, 5, 5, 2};
        assertEquals(5, problems.getMaxNumber(arr2));


//        int [] arr3 = new int[0];
//        int actual3 = problems.getMaxNumber(arr3);


    }


}
