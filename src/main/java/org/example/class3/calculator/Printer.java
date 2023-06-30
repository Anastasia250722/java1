package org.example.class3.calculator;

public class Printer {

    private String name;

    public Printer(String name) {
        this.name = name;
    }

    public void print(double num) {
        System.out.println("Output from printer with name '" + name + "'");
        System.out.println("result: " + num + "\n");
    }

    public void print(double num, String calculatorName) {
        System.out.println("Output from printer with name '" + name + "'");
        System.out.println("result of '" + calculatorName + "' is: " + num + "\n");
    }


}
