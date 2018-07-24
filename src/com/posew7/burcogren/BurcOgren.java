package com.posew7.burcogren;

import java.util.Scanner;

public class BurcOgren {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gun;
        int ay;

        System.out.println("doğduğnuz günü giriniz");
        gun = input.nextInt();

        System.out.println("doğdunuz ayı giriniz sayı olarak");
        ay = input.nextInt();

        burcOgren(gun, ay);

    }

    public static void burcOgren(int p_gun, int p_ay) {

        if ((p_gun >= 21 && p_ay == 3) || (p_gun <= 19 && p_ay == 4)) {
            System.err.println("burcunuz KOÇ");
        } else if ((p_gun >= 20 && p_ay == 4) || (p_gun <= 20 && p_ay == 5)) {
            System.err.println("burcunuz BOĞA");
        } else if ((p_gun >= 21 && p_ay == 5) || (p_gun <= 20 && p_ay == 6)) {
            System.err.println("burcunuz İKİZLER");
        } else if ((p_gun >= 21 && p_ay == 6) || (p_gun <= 22 && p_ay == 7)) {
            System.err.println("burcunuz YENGEÇ");
        } else if ((p_gun >= 23 && p_ay == 7) || (p_gun <= 22 && p_ay == 8)) {
            System.err.println("burcunuz ASLAN");
        } else if ((p_gun >= 23 && p_ay == 8) || (p_gun <= 22 && p_ay == 9)) {
            System.err.println("burcunuz BAŞAK");
        } else if ((p_gun >= 23 && p_ay == 9) || (p_gun <= 22 && p_ay == 10)) {
            System.err.println("burcunuz TERAZİ");
        } else if ((p_gun >= 23 && p_ay == 10) || (p_gun <= 21 && p_ay == 11)) {
            System.err.println("burcunuz AKREP");
        } else if ((p_gun >= 22 && p_ay == 11) || (p_gun <= 21 && p_ay == 12)) {
            System.err.println("burcunuz YAY");
        } else if ((p_gun >= 22 && p_ay == 12) || (p_gun <= 19 && p_ay == 1)) {
            System.err.println("burcunuz OĞLAK");
        } else if ((p_gun >= 20 && p_ay == 1) || (p_gun <= 18 && p_ay == 2)) {
            System.err.println("burcunuz KOVA");
        } else if ((p_gun >= 19 && p_ay == 2) || (p_gun <= 20 && p_ay == 3)) {
            System.err.println("burcunuz BALIK");
        }

    }

}
