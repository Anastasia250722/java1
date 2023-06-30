package org.example.class4.example;

import java.util.*;

/**
 * <p><a href="https://www.youtube.com/watch?v=Qd8-vNdo1sc&ab_channel=%D0%A1%D0%B5%D1%80%D0%B3%D0%B5%D0%B9%D0%9F%D0%B5%D1%82%D1%80%D0%B5%D0%BB%D0%B5%D0%B2%D0%B8%D1%87">Коллекции, Мапы</a></p>
 * <p>Сборщики проекта</p>
 * <p><a href="https://www.youtube.com/watch?v=Sm6QooVMt6k&ab_channel=OTUS%D0%9E%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD-%D0%BE%D0%B1%D1%80%D0%B0%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5">Maven</a></p>
 * <p><a href="https://www.youtube.com/watch?v=ndyCOMZxmOw&list=PLfj4GrGKdyat6IGU2ZrDr3QfIntLFMKi7&index=4&t=9s&ab_channel=%D0%A1%D0%B5%D1%80%D0%B3%D0%B5%D0%B9%D0%9F%D0%B5%D1%82%D1%80%D0%B5%D0%BB%D0%B5%D0%B2%D0%B8%D1%87">Gradle</a></p>
 * <a href="https://www.youtube.com/playlist?list=PLDyvV36pndZEgSRzWGuXFrTRUFuAAMciE">Краш курс по гиту</a>
 */
public class Example {

    public static void main(String[] args) {
        System.out.println("array example");
        arrExample();

        System.out.println("list example");
        arrayListExample();

        System.out.println("set example");
        setExample();


        System.out.println("map example");
        mapExample();
    }


    static void arrExample() {
        int [] array = {10,20,30};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int item : array) {
            System.out.println(item);
        }
    }


    static void arrayListExample() {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for (Integer element : arrayList) {
            System.out.println(element);
        }

    }

    static void linkedListExample() {
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        for (Integer element : linkedList) {
            System.out.println(element);
        }
    }

    static void setExample() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);

        for (Integer element : set) {
            System.out.println(element);
        }
    }

    static void mapExample() {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key " + entry.getKey());
            System.out.println("value " + entry.getValue());
        }

    }


}
