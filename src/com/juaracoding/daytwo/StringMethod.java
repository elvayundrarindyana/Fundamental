package com.juaracoding.daytwo;


public class StringMethod {
        public static void main(String[] args) {
                String actual = "Data berhasil disimpan";
                String expect = "Berhasil";

                System.out.println(actual.contains(expect));

                // isi dari string harus sama hurufnya
                String browser = "Chrome";
                String pilihChrome = "Chrome";
                String pilihFirefox = "Firefox";
                if (pilihChrome.equals(browser)) {
                        System.out.println("Browser Chrome");
                } else if(pilihFirefox.equalsIgnoreCase(browser)) {
                        System.out.println("Browser Firefox");
                } else {
                        System.out.println("Error");
                }
                System.out.println(browser.toUpperCase());
                System.out.println(browser.substring(1,4)); //akan mengabil fire dari kata firefox
                System.out.println(browser.substring(4,7));
        }
}
