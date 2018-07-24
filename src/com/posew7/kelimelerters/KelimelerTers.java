package com.posew7.kelimelerters;

import java.util.Scanner;

public class KelimelerTers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a, b, c;

        System.err.println("3 kelime giriniz");
        a = input.nextLine();
        b = input.nextLine();
        c = input.nextLine();

        System.out.println(c +" "+ b +" "+ a);
    }
}
