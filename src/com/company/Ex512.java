package com.company;

public class Ex512 {
    public static void main(String[] args)
    {
        int product = 1;
        int i;
        for(i = 1; i<=15;i++)
        {
            product=i*product;
            System.out.printf(" "+i);
        }
        System.out.printf("\nThe product of the odd integers from 1 to 15: "+product);
    }
}
