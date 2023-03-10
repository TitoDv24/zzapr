package zzapr;

import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {

        Scanner input = new java.util.Scanner(System.in);

        System.out.print("Write from which value to start the table: ");
        int start = input.nextInt();

        System.out.print("Write which will be the last value of the table: ");
        int end = input.nextInt();


        //rows
        for (int i = start; i <= end; i++ ) {
            //columns
            for(int j =start; j<=end; j++ ) {
                System.out.printf("%6d", i * j);
            }
            System.out.println();
        }

    }
}
