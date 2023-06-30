package org.example.class5.exception;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) throws CustomException {
        catchException(0);
    }

    public static void callException(int n) throws CustomException {
        if (n == 0) {
            throw new CustomException("n == 0", new Throwable());
        }
        System.out.println(n);
    }

    public static void catchException(int n) {
        int num = 4;

        try {
            int result = num / n;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            e.printStackTrace();
//            throw new CustomException("its our exception", e);
        }
    }
}
