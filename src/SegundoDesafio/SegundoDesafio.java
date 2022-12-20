package SegundoDesafio;

import java.util.Locale;
import java.util.Scanner;

public class SegundoDesafio {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        double remaining;

        int note100 = (int) (value / 100);
        remaining = value % 100;
        int note50 = (int) (remaining / 50);
        remaining = remaining % 50;
        int note20 = (int) (remaining / 20);
        remaining = remaining % 20;
        int note10 = (int) (remaining / 10);
        remaining = remaining % 10;
        int note5 = (int) (remaining / 5);
        remaining = remaining % 5;
        int note2 = (int) (remaining / 2);
        remaining = remaining % 2;

        double valueCoins = remaining;
        double remainingCoins;

        int coin100 = (int) (valueCoins);
        remainingCoins = valueCoins % 1.0;
        int coin50 = (int) (remainingCoins / 0.50);
        remainingCoins = remainingCoins % 0.50;
        int coin25 = (int) (remainingCoins / 0.25);
        remainingCoins = remainingCoins % 0.25;
        int coin10 = (int) (remainingCoins / 0.10);
        remainingCoins = remainingCoins % 0.10;
        int coin5 = (int) (remainingCoins / 0.05);
        remainingCoins = remainingCoins % 0.05;
        int coin1 = (int) (remainingCoins / 0.01);

        System.out.println("NOTAS:");
        System.out.println(note100 + "    nota(s)    de    R$    100.00");
        System.out.println(note50 + "    nota(s)    de    R$    50.00");
        System.out.println(note20 + "    nota(s)    de    R$    20.00");
        System.out.println(note10 + "    nota(s)    de    R$    10.00");
        System.out.println(note5 + "    nota(s)    de    R$    5.00");
        System.out.println(note2 + "    nota(s)    de    R$    2.00");

        System.out.println("MOEDAS:");
        System.out.println(coin100 + "    moeda(s)    de    R$    1.00");
        System.out.println(coin50 + "    moeda(s)    de    R$    0.50");
        System.out.println(coin25 + "    moeda(s)    de    R$    0.25");
        System.out.println(coin10 + "    moeda(s)    de    R$    0.10");
        System.out.println(coin5 + "    moeda(s)    de    R$    0.05");
        System.out.println(coin1 + "    moeda(s)    de    R$    0.01");
    }
}
