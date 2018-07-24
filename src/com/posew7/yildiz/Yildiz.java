package com.posew7.yildiz;

import java.util.Scanner;

public class Yildiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.err.println("kaç sıra olsun istersiniz");
        int a = input.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }

            System.out.println("");
        }

    }

}
