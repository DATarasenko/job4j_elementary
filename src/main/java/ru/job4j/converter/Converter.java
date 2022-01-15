package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static double rubleToDollar(int value) {
        int rsl1 = value * 100 / 60;
        return (double) rsl1 / 100;
    }

    public static void main(String[] args) {
        double dolar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dolar + " dolar.");
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
    }
}