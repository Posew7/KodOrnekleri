package com.posew7.rastgelesayi;

import java.util.Random;

public class RastgeleSayi {

    public static void main(String[] args) {

        Random rand = new Random();

        int a = rand.nextInt(999) + 1;
        int bir, on, yuz, bin;

        System.out.println("rastgele sayımız " + a);

        bin = a % 10;
        a = a / 10;

        yuz = a % 10;
        a = a / 10;

        on = a % 10;
        a = a / 10;

        bir = a / 10;

        System.err.println("basamakları toplamı" + (bin + bir + on + yuz));

    }
}
