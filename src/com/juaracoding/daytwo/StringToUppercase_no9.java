package com.juaracoding.daytwo;

import java.util.Scanner;

public class StringToUppercase_no9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine().toUpperCase();
        String profesi = scan.nextLine().toUpperCase();
        String salary = scan.nextLine().toUpperCase();

            System.out.println("Nama: " + nama);
            System.out.println("Profesi: " + profesi);
            System.out.println("Salary: " + salary);
        }
    }

