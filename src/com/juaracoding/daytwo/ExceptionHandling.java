package com.juaracoding.daytwo;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
          //  int hasil = 100 / 0;
        } catch (ArithmeticException e) { //generic, bisa dipakai(aritmetic)
            //    e.printStackTrace();
            //        System.err.println(e);
            System.out.println("java.lang.ArithmeticException: / by zero");
           // System.out.println("");
           // System.out.println("Alternatif: 2");
            String s="Alternatif: 20";
            System.out.println(s.substring(0,2));
            System.out.println("Eksekusi code berikutnya");
            System.out.println("Ket:");
            //   System.out.println("Modifikasi Nama Error");
        }
            Scanner scanner = new Scanner(System.in);
            String angka = scanner.nextLine();
            String angka2 = scanner.nextLine();
//            System.out.print(angka);
//            System.out.print(angka2);

            System.out.println("\nA = " + angka +",  " + "B = " + angka2);
           // String browser = "Eksekusi Code Berikutnya"; //kalau diisi null; error exception
            try {
        //        System.out.println(browser.length()); //banyaknya huruf
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }


