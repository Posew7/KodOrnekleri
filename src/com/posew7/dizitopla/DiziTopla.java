package com.posew7.dizitopla;

public class DiziTopla {

    public static void main(String[] args) {

        int dizi[] = new int[4];
        int sayi = 5;
        int toplam = 0;

        for (int i = 0; i < 4; i++) {
            dizi[i] = sayi;
            sayi++;
        }

        for (int i = 0; i < 4; i++) {
            toplam = toplam + dizi[i];

        }

        System.out.println("Dizinin Toplamı " + toplam);
    }

}
