package com.company;
import java.util.Scanner;

public class Ex517 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double totalR=0;
        while(true){
            System.out.println("1 - Product 1, $2.98");
            System.out.println("2 - Product 2, $4.50");
            System.out.println("3 - Product 3, $9.98");
            System.out.println("4 - Product 4, $4.49");
            System.out.println("5 - Product 5, $6.87");
            System.out.println("6 - Exit program");
            System.out.print("Enter product number: ");
            int prodnum=scan.nextInt();
            if(prodnum==6){
                break;
            }
            System.out.print("Enter quantity sold: ");
            int quantitySold=scan.nextInt();
            switch(prodnum){
                case 1:
                    totalR+=2.98*quantitySold;
                    break;
                case 2:
                    totalR+=4.50*quantitySold;
                    break;
                case 3:
                    totalR+=9.98*quantitySold;
                    break;
                case 4:
                    totalR+=4.49*quantitySold;
                    break;
                case 5:
                    totalR+=6.87*quantitySold;
                    break;
            }

            System.out.println("\nThe total retail value of all products sold: $"+totalR);
        }
    }
}
