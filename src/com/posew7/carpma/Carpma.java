package com.posew7.carpma;

import java.util.Scanner;

public class Carpma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.println("çarpılmasını istediğiniz 3 sayıyı giriniz");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.err.println("sonuc " + a * b * c);

    }
}
