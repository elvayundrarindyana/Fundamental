package com.juaracoding.daytwo;
import java.util.Scanner;

public class ClassnObject_no7 {
    public static void main(String[] args) {
        Scanner computer1 = new Scanner(System.in);

        String processor = computer1.next();
        String motherboard = computer1.next();
        int ram = computer1.nextInt();
        int angka = computer1.nextInt();
        String gpu = computer1.nextLine();
        String harddisk = computer1.nextLine();


        System.out.print("Processor: " + processor + "," + " " +"Motherboard: " + motherboard + "," + "RAM: " + ram + "x" +angka+ "," + "GPU :" + gpu.substring(0,5) + "," + " "+"Harddisk: " + harddisk);

    }
}