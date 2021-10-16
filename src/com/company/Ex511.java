package com.company;
import java.util.Scanner;

public class Ex511 {
    public static void main(String[] args) {
        int num = 0;
        int a=0;
        int smallest=Integer.MAX_VALUE;;
	Scanner scan = new Scanner(System.in);
        System.out.printf("Enter number of values: ");
        num = scan.nextInt();
        for(int i=1;i<=num;i++) {
            System.out.printf("Enter "+i+" number: ");
            a = scan.nextInt();
            if(a<smallest)
            {
                smallest=a;
            }

        }
        System.out.printf("The smallest number is "+smallest);
    }
}
