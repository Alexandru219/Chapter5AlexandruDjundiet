package com.company;
import java.util.Scanner;

public class Ex516 {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int num[]=new int[5];
        int i;
        for(i=0;i<5;i++)
        {
            System.out.printf("Enter 5 numbers between 1 and 30: ");
            num[i] = scan.nextInt();
        }
        for(i=0;i<5;i++) {
            for(int j=0; j<num[i];j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
