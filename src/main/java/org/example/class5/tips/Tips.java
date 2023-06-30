package org.example.class5.tips;

public class Tips {

    public static void main(String[] args) {
    }

    static void stringIterateExample() {
        String example = "love";

        System.out.println("Итерируемся по строке от первого до последнего символа");
        for (int i = 0; i < example.length(); i ++) {
            // обрати внимание на тип данных и на метод, с помощью которого можно получить текущий символ строки
            char currentWord = example.charAt(i);
            System.out.println(currentWord);
        }

        System.out.println("Итерируемся по строке от последнего до первого символа");
        for (int i = example.length() - 1; i >= 0; i--) {
            char currentWord = example.charAt(i);
            System.out.println(currentWord);
        }
    }


    static void concatenateString() {
        String foo = "foo";
        String bar = "bar";

        for (int i = 0; i < bar.length(); i ++) {
            foo += bar.charAt(i);
        }

        System.out.println(foo);
    }

    static void splitStringToArray() {
        String str = "i'm an unique string";

        String [] strArray = str.split(" ");

        for (String word : strArray) {
            System.out.println(word);
        }
    }

    static void arrayToString() {
        String [] array = {"i'm", "an", "unique", "string"};
        String str = String.join(" ", array);
        System.out.println(str);
    }
}
