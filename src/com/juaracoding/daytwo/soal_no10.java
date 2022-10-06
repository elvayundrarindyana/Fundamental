package com.juaracoding.daytwo;

import java.util.Scanner;

public class soal_no10 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String nama = scan.nextLine().toUpperCase();
            String nim = scan.nextLine().toUpperCase();

            System.out.println("Nama: "+nama);
            System.out.println("NIM: "+nim);
            System.out.println("Tahun Masuk: "+nim.substring(0,4));
        }
    }
