package com.juaracoding.daytwo;
import java.util.Scanner;

    public class switchcase_no2 {
        public static void main(String[] args) {

            // membuat variabel dan Scanner
            String Weekday, Weekend;
            Scanner scan = new Scanner(System.in);

            // mengambil input
            String day = scan.nextLine();

            switch(day){
                case "Weekday":
                    System.out.println("Senin Selasa Rabu Kamis Jum'at");
                    break;
                case "Weekend":
                    System.out.println("Sabtu Minggu");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }