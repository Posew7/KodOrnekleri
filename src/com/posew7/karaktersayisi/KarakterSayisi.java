package com.posew7.karaktersayisi;

import java.util.Scanner;

public class KarakterSayisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a;

        System.err.println("bic cümle giriniz");
        a = input.nextLine();

        System.err.println("cümle de toplam " + a.length() + " karakter bulunmaktadır");

    }

}
