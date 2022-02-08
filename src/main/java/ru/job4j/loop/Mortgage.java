package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {    //  200  ,  120  ,  50
        int year = 0;
        double salary1 = (int) salary;
        while (amount > 0) {
            amount = amount + amount * percent / 100 - salary1;
            year++;
        }
        return year;
    }
}