package com.juaracoding.daytwo;
import java.util.Scanner;

public class Ifelse_no3 {

        public static void main(String args[]){
            byte nilai;
            Scanner input = new Scanner(System.in);
            nilai = input.nextByte();

            if (nilai == 4 ) {
                System.out.println("Not Weird");
            }
                else if(nilai == 22) {
                    System.out.println("Not Weird");
            }
                else if (nilai == 7 ) {
                    System.out.println("Weird");
            }
            else {
            }
        }
    }

