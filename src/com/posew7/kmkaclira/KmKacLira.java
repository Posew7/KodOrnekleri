package com.posew7.kmkaclira;

import java.util.Scanner;

public class KmKacLira {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int benzinFiyat;
        int gidilenYol;
        boolean sonuc = true;

        System.out.println("deponuza kaç liralık yakıt koydunuz");
        benzinFiyat = input.nextInt();
        
        System.out.println("kaç kilometre yol gittiniz");
        
        while (sonuc) {

            gidilenYol = input.nextInt();

            if (gidilenYol >= 1000) {
                System.err.println("1000 kilometreden küçük bir mesafe giriniz");
                sonuc = true;
            } else {
                System.err.println("kilometre başına " + benzinFiyat / gidilenYol + " lira yakmış");
                sonuc = false;
            }
        }

    }
}
