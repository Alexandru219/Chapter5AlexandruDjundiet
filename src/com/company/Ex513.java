package com.company;
import java.util.Scanner;

public class Ex513 {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        long factorial=1;
        long i;
        for(i=1;i<=20;i++)
        {
            factorial = factorial*i;
            System.out.printf("\nFactorial of "+i+" is "+factorial);
        }
    }
}
