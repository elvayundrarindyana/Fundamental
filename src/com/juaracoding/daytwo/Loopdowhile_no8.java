package com.juaracoding.daytwo;
import java.util.Scanner;

public class Loopdowhile_no8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bil = 0;
        scanner.nextInt();
        while (bil <= 8) {
            bil += 2;
            System.out.print(bil);
        }
        int bil2 = 24;
        scanner.nextInt();
        while (bil2 >= 4) {
            bil2 -= 4;
            System.out.print(bil2);
        }
        int bil3 = 0;
        scanner.nextInt();
        while (bil3 <= 18) {
            bil3 += 2;
            System.out.print(bil3);
        }
        int bil4 = 32;
        scanner.nextInt();
        while (bil4 >=4 ) {
            bil4 -= 4;
            System.out.print(bil4);
        }
    }
}