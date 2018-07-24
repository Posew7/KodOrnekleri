package com.posew7.aritmetikortalama;

import java.util.Scanner;

public class AritmetikOrtalama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;
        double sonuc;

        System.out.println("3 sayı giriniz");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        sonuc = (double) (a + b + c) / 3;

        System.out.println("aritmetik ortalama " + sonuc);

    }

}
