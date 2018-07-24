package com.posew7.basamaklisayideger;

import java.util.Scanner;

public class BasamakliSayiDeger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, bir, on, yuz, bin;

        System.out.println("4 basamaklı sayı giriniz");
        a = input.nextInt();

        bir = a%10;
        
        a=a/10;
        on =a%10;
        
        a=a/10;
        yuz=a%10;
       
        a = a / 10;
        bin = a;

        System.out.println("basamakları toplamı " + (bir + bin + on + yuz));
    }

}
