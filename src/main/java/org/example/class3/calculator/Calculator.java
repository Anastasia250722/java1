package org.example.class3.calculator;

/*
    ООП. Идея. Используем в коде объекты.
    1. Инкапсуляция
    2. Наследование
    3. Полиморфизм
 */
public class Calculator {

    private String calcName = "default calculator name";
    private double calcDistortion = 1.0;
    private Printer calcPrinter;


    public Calculator(String calcName, double calcDistortion, Printer calcPrinter) {
        this.calcName = calcName;
        this.calcDistortion = calcDistortion;
        this.calcPrinter = calcPrinter;
    }

    public Calculator(Printer calcPrinter) {
        this.calcPrinter = calcPrinter;
    }

    private double sum(int a, int b) {

        return (a + b) * calcDistortion;
    }

    public void calcSum(int a, int b) {
        double result = sum(a, b);
        calcPrinter.print(result, calcName);
    }


    /*
        Boilerplate
     */
    public String getCalcName() {
        return calcName;
    }

    public void setCalcName(String calcName) {
        this.calcName = calcName;
    }

    public double getCalcDistortion() {
        return calcDistortion;
    }

    public void setCalcDistortion(double calcDistortion) {
        this.calcDistortion = calcDistortion;
    }
}



