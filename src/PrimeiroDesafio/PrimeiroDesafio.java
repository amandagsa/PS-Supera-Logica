package PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {

    public static void main(String[] args) {

        int value;
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> notEvenNumbers = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int quantityValues = input.nextInt();

        for (int i = 0; i < quantityValues; i++) {
            value = input.nextInt();
            if ((value % 2) == 0) {
                evenNumbers.add(value);
            } else {
                notEvenNumbers.add(value);
            }
        }

        Collections.sort(evenNumbers);
        notEvenNumbers.sort(Collections.reverseOrder());

        for (int i : evenNumbers) {
            System.out.println(i);
        }

        for (int i : notEvenNumbers) {
            System.out.println(i);
        }
    }
}

