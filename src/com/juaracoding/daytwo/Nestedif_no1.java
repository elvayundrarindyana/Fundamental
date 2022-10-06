package com.juaracoding.daytwo;
import java.util.Scanner;
public class Nestedif_no1 {
    public static void main(String[] args) {

        int tanggaldanplat;
        Scanner nested = new Scanner(System.in);
        tanggaldanplat = nested.nextInt();

        if (tanggaldanplat == 12) {
            System.out.println("Tanggal genap dan plat nomor genap");
        } else if (tanggaldanplat == 1234) {
            System.out.println("Tanggal genap dan plat nomor genap");
        } else if (tanggaldanplat == 13) {
            System.out.println("Tanggal ganjil dan plat nomor ganjil");
        }else if (tanggaldanplat == 1235) {
                System.out.println("Tanggal ganjil dan plat nomor ganjil");
            } else if (tanggaldanplat == 14) {
                System.out.println("Tanggal genap dan plat nomor ganjil");
            } else if (tanggaldanplat == 1237) {
                System.out.println("Tanggal genap dan plat nomor ganjil");
            }
        }
    }

