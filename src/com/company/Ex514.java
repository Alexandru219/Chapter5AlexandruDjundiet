package com.company;

public class Ex514 {
    public static void main(String[] args)
    {
        double amount;
        double amount1;
        double amount2;
        double amount3;
        double amount4;
        double amount5;
        double principal = 1000.0;
        double r = 0.05;
        double r1 = 0.06;
        double r2 = 0.07;
        double r3 = 0.08;
        double r4 = 0.09;
        double r5 = 0.10;

        System.out.printf("%s %20s %20s %20s %20s %20s %20s  %n", "Year", "Rate=5% ", "Rate=6% ", "Rate=7% ", "Rate=8% ",
                "Rate=9% ", "Rate=10% ");
        for (int year = 1; year <= 10; ++year)
        {
            amount = principal * Math.pow(1.0 + r, year);
            amount1 = principal * Math.pow(1.0 + r1, year);
            amount2 = principal * Math.pow(1.0 + r2, year);
            amount3 = principal * Math.pow(1.0 + r3, year);
            amount4 = principal * Math.pow(1.0 + r4, year);
            amount5 = principal * Math.pow(1.0 + r5, year);

            System.out.printf("\n%4d %,20.2f %,20.2f %,20.2f %,20.2f %,20.2f %,20.2f %n ", year, amount, amount1,
                    amount2, amount3, amount4, amount5);

        }
    }
    }

